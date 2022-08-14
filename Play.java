package com.programmers.practice;

public class Play {

	//���̱ⱸ�� ���� �̿��� price�� �ε�, ���̱ⱸ�� N �� ° �̿��Ѵٸ� ���� �̿���� N�踦 �ޱ�� ��
	//���̱ⱸ�� count�� Ÿ�� �Ǹ� ���� �ڽ��� ������ �ִ� �ݾ׿��� �󸶰� ���ڶ������ return
	//�ݾ��� �������� ������ 0�� return

	class Solution {
		public long solution(int price, int money, int count) {
			
			long answer = -1; //��ȯ�� �ʱ�ȭ
			
			long sum =0; //�հ谪 �ʱ�ȭ
			for (int i =1; i<=count; i++) {
				sum += price*i; //�ѱݾ� = ���� * i(1+2+3+4) count�� 4�� ���
			}

			if (sum> money) {
				answer = sum-money; //���̱ⱸ�� �հ谡���� ���������� Ŭ ��� ���ڶ� �ݾ� return
			} else{
				answer =0; //�������� ���̱ⱸ�� �հ谡�ݺ��� Ŭ ��� 0����
			}
			return answer;

		}
	}

}
