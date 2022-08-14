package com.programmers.practice;

//전화번호 뒷자리 4개 빼고 * 로 가리는 문제

class Solution2 {
    public String solution(String phone_number) { //String 으로 전화번호가 주어지고 새로운 전화번호 리턴

    int len = phone_number.length();// 전화번호의 길이
    String star ="";// 가릴문자
    String solution =""; //새로운 전화번호
      
      for(int i=0; i<len-4; i++){ //뒷자리 4개빼고 문자열 * 붙이기
          star += "*";
      }
        
     solution = star + phone_number.substring(len-4);
     
     //새로운 전화번호: * 문자열 + 뒤에서 4자리 가져오기 
     
       return solution; 
    }
}