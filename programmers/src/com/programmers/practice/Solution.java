package com.programmers.practice;
// 정수를 반대로 뒤집어서 배열에 넣기
class Solution {
	
	public int[] solution(long n) {
		
		String newN = String.valueOf(n);
		int[] answer = new int[newN.length()];
		int len = answer.length;

		int index = 0;
		
		for (int i = len - 1; i >= 0; i--) { // answer 배열을 반대로 리버스 
			answer[index] = newN.charAt(i) - '0'; // int 를 정수로 변환 48을 빼주어도됨.
			index++;
		}
		return answer;

	}
}