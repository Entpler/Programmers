//int �迭�� �־����� ���� �������� �����ϰ� �迭�� �ٽ� �����ϴ� �Լ��� �ϼ��ϱ�
package com.programmers.practice;

import java.util.ArrayList;

public class MinNumber {
	public int[] solution(int[] arr) {

		ArrayList<Integer> list = new ArrayList<>(); //ArrayList����

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]); //�־��� �迭�� Arraylist�� �ֱ�
		}
		int min = list.get(0); //ArrayList���� ���� ���� �� �ʱ�ȭ

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > min) {
				min = list.get(i); //list���� ���� ���� �� ã��
			}
		}
		if (list.size() != 1) { //����Ʈ�� ����� 1�� �ƴҶ�(�迭 ���Ұ� �ϳ��� ������ �����ϰ�)
			list.remove(new Integer(min));//���� ���� ���� �����ϱ� => ���� * remove�� ������ remove(i) index�� ������ �ǹǷ�
			//int�� �����ϰ� �ʹٸ� Integer Object ���·� �ٲ㼭 ���� �־��־�� �Ѵ�.
		}

		int[] answer = new int[list.size()]; //���ο� �迭 ���� 

		if (list.size() == 0) {//����Ʈ�� ����� 0�̸�
			answer[0] = -1; //-1�� ��ȯ
		} else if (list.size() != 0) { //0�� �ƴҶ�
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i); //����Ʈ�� �迭�� �ֱ�

			}

		}
		return answer; //�迭��ȯ

	}
}
