package com.programmers.practice;

public class Play {

	//놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 함
	//놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return
	//금액이 부족하지 않으면 0을 return

	class Solution {
		public long solution(int price, int money, int count) {
			
			long answer = -1; //반환값 초기화
			
			long sum =0; //합계값 초기화
			for (int i =1; i<=count; i++) {
				sum += price*i; //총금액 = 가격 * i(1+2+3+4) count가 4일 경우
			}

			if (sum> money) {
				answer = sum-money; //놀이기구의 합계가격이 가진돈보다 클 경우 모자란 금액 return
			} else{
				answer =0; //가진돈이 놀이기구의 합계가격보다 클 경우 0리턴
			}
			return answer;

		}
	}

}
