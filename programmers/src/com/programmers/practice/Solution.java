package com.programmers.practice;
import java.util.Arrays;
public class Solution {

	public static void main(String[] args) {
		
		 	int n = 118372 ; 
		 	
		      String newN = String.valueOf(n); // n을 String으로 변환 
		      
		      int[] arr = new int[newN.length()]; // String으로 변환한 n을 담을 int배열 선언
		      
		        for(int i = 0; i<arr.length; i++){
		            arr[i] = (newN.charAt(i)) -'0'; //String을 char로 변환 후 정수만 추출후 int 배열에 담기
		        }
		        
		        Arrays.sort(arr); // 배열을 오름차순 정렬
		        
		        String str = "";
		        
		        for(int i  = arr.length-1;  i>=0; i--){
		            str += arr[i]; //배열을 다시 내림차순 정렬 후 String으로 변환 , 내림차순 정렬시에는 배열길이 마지막부터 0까지 
		            				//넣어준다.
		        }
		        
		        Long answer = Long.parseLong(str);// 내림차순 정렬된 배열을 Long으로 변환
		        
		        System.out.println(answer);
		       
	}

}
