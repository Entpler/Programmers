package programmers;

import java.util.Scanner;

public class E {
	//���ӵ� ���� �� => 3, 12 �� �־����� 3,4,5 �� �迭�� ����ϴ� ����
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		 int num = in.nextInt(); //���ڰ� �־���
		 int total = in.nextInt(); //���� �־��� 
		 int [] answer = new int[num];//�迭�� �־��� 
		 
		 int left = (total/num); // �� ���ϴ� �������� 
		 int midNum = (total%num == 0? num/2 : num/2-1); //��� ���ڴ�
		 //�������� 0�ϰ�� ������2�� �� ��, �׷��� ���� ��� -1 �� �� �� ���׿����� ���.
		 int strNum = left-midNum;
		 //ù��° ���ڴ� ���������� �߰� ���� �� ����
			 for(int i=0; i<num; i++) {
				answer[i]=strNum + i;
			 }
		 
		 for(int i =0; i<num; i++) {
			 System.out.println(answer[i]);
		 }

	}

}
