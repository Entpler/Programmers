package com.programmers.practice;
import java.util.Arrays;
public class Solution {

	public static void main(String[] args) {
		
		 	int n = 118372 ; 
		 	
		      String newN = String.valueOf(n); // n�� String���� ��ȯ 
		      
		      int[] arr = new int[newN.length()]; // String���� ��ȯ�� n�� ���� int�迭 ����
		      
		        for(int i = 0; i<arr.length; i++){
		            arr[i] = (newN.charAt(i)) -'0'; //String�� char�� ��ȯ �� ������ ������ int �迭�� ���
		        }
		        
		        Arrays.sort(arr); // �迭�� �������� ����
		        
		        String str = "";
		        
		        for(int i  = arr.length-1;  i>=0; i--){
		            str += arr[i]; //�迭�� �ٽ� �������� ���� �� String���� ��ȯ , �������� ���Ľÿ��� �迭���� ���������� 0���� 
		            				//�־��ش�.
		        }
		        
		        Long answer = Long.parseLong(str);// �������� ���ĵ� �迭�� Long���� ��ȯ
		        
		        System.out.println(answer);
		       
	}

}
