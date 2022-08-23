//int 배열이 주어지면 가장 작은수를 삭제하고 배열로 다시 리턴하는 함수를 완성하기
package com.programmers.practice;

import java.util.ArrayList;

public class MinNumber {
	public int[] solution(int[] arr) {

		ArrayList<Integer> list = new ArrayList<>(); //ArrayList선언

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]); //주어진 배열을 Arraylist에 넣기
		}
		int min = list.get(0); //ArrayList에서 가장 작은 수 초기화

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > min) {
				min = list.get(i); //list에서 가장 작은 수 찾기
			}
		}
		if (list.size() != 1) { //리스트의 사이즈가 1이 아닐때(배열 원소가 하나만 있을때 제외하고)
			list.remove(new Integer(min));//가장 작은 값을 삭제하기 => 주의 * remove를 쓸때는 remove(i) index로 삭제가 되므로
			//int를 삭제하고 싶다면 Integer Object 형태로 바꿔서 값을 넣어주어야 한다.
		}

		int[] answer = new int[list.size()]; //새로운 배열 선언 

		if (list.size() == 0) {//리스트의 사이즈가 0이면
			answer[0] = -1; //-1로 반환
		} else if (list.size() != 0) { //0이 아닐때
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i); //리스트를 배열에 넣기

			}

		}
		return answer; //배열반환

	}
}
