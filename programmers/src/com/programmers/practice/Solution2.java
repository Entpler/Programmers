package com.programmers.practice;

//��ȭ��ȣ ���ڸ� 4�� ���� * �� ������ ����

class Solution2 {
    public String solution(String phone_number) { //String ���� ��ȭ��ȣ�� �־����� ���ο� ��ȭ��ȣ ����

    int len = phone_number.length();// ��ȭ��ȣ�� ����
    String star ="";// ��������
    String solution =""; //���ο� ��ȭ��ȣ
      
      for(int i=0; i<len-4; i++){ //���ڸ� 4������ ���ڿ� * ���̱�
          star += "*";
      }
        
     solution = star + phone_number.substring(len-4);
     
     //���ο� ��ȭ��ȣ: * ���ڿ� + �ڿ��� 4�ڸ� �������� 
     
       return solution; 
    }
}