package com.programmers.practice;
// ������ �ݴ�� ����� �迭�� �ֱ�
class Solution {
	
	public int[] solution(long n) {
		
		String newN = String.valueOf(n);
		int[] answer = new int[newN.length()];
		int len = answer.length;

		int index = 0;
		
		for (int i = len - 1; i >= 0; i--) { // answer �迭�� �ݴ�� ������ 
			answer[index] = newN.charAt(i) - '0'; // int �� ������ ��ȯ 48�� ���־��.
			index++;
		}
		return answer;

	}
}