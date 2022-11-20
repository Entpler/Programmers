package programmers;

import java.util.Scanner;

public class E {
	//연속된 수의 합 => 3, 12 가 주어지면 3,4,5 의 배열을 출력하는 문제
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		 int num = in.nextInt(); //숫자가 주어짐
		 int total = in.nextInt(); //합이 주어짐 
		 int [] answer = new int[num];//배열이 주어짐 
		 
		 int left = (total/num); // 몫 구하는 변수선언 
		 int midNum = (total%num == 0? num/2 : num/2-1); //가운데 숫자는
		 //나머지가 0일경우 나누기2를 한 몫, 그렇지 않은 경우 -1 을 한 값 삼항연산자 사용.
		 int strNum = left-midNum;
		 //첫번째 숫자는 나머지에서 중간 값을 뺀 숫자
			 for(int i=0; i<num; i++) {
				answer[i]=strNum + i;
			 }
		 
		 for(int i =0; i<num; i++) {
			 System.out.println(answer[i]);
		 }

	}

}
