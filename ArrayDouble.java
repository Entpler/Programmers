package com.programmers.practice;

public class ArrayDouble {

	public class Solution {

		public int[] solution(int[] numbers) {
			int[] answer = {}; //자연수 배열 선언

			for (int i = 0; i < answer.length; i++) {
				answer[i] += numbers[i] * 2; //배열 2배 만들기

			}

			return answer;

		}
	}
}
