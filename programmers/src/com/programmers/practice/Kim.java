
package com.programmers.practice;

//String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, 
//"김서방은 x에 있다"는 String을 반환하는 함수, solution
//["Jane", "Kim"] => "김서방은 1에 있다"

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

	answer="김서방은 "+status+"에있습니다";return answer;

	}

	public static void main(String[] args) {
		Kim k = new Kim();

		String[] seoul = { "Min", "po", "Park", "Kim" };

		System.out.println(k.solution(seoul));

	}

}
