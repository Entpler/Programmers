
package com.programmers.practice;

//String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, 
//"�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� �Լ�, solution
//["Jane", "Kim"] => "�輭���� 1�� �ִ�"

public class Kim {

	public String solution(String[] seoul) {

		String answer = " ";

		int status = 0;
		
		  
		  for(String c : seoul) {
		   if(c.equals("Kim")) {
			   break;
		   	}
			   status++;
		  	}

	/*
	 * int i; for (i = 0; i < seoul.length; i++) 
	 * { if (seoul[i].equals("Kim")) {
	 * break; } } status = i;
	 */

	answer="�輭���� "+status+"���ֽ��ϴ�";return answer;

	}

	public static void main(String[] args) {
		Kim k = new Kim();

		String[] seoul = { "Min", "po", "Park", "Kim" };

		System.out.println(k.solution(seoul));

	}

}
