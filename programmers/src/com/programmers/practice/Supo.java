package com.programmers.practice;
//������ 3���� ���� ���� ���� ��� �迭�� �ֱ�. 1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, 
//���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ��ϱ�
import java.util.ArrayList;

public class Supo {
	
	public int[] solution(int[] answers) {
        int solutions[] = {};//����� �迭

        ArrayList<Integer> arr1 = new ArrayList<>(); //������ 1�� ArrayList
        ArrayList<Integer> arr2 = new ArrayList<>(); //������ 2�� ArrayList
        ArrayList<Integer> arr3 = new ArrayList<>(); //������ 3�� ArrayList

        int count = 0; //������1 ����� 
        int count2 = 0;//������2 ����� 
        int count3 = 0;//������3 ����� 
        					//��ü ��������ŭ �ݺ��ؼ� �ֱ�
        for (int i = 0; i < answers.length; i++) {
            arr1.add(1);
            arr1.add(2);
            arr1.add(3);
            arr1.add(4);//1�� �����ڰ� ��¹��
            arr1.add(5); // ������ �迭�� ��� �� �ֱ�
        }

        int result[] = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            result[i] = arr1.get(i); //������1�� ArrayList�� �迭�� ��ȯ
        }
        for (int i = 0; i < answers.length; i++) {
            arr2.add(2);
            arr2.add(1);
            arr2.add(2);
            arr2.add(3);
            arr2.add(2);	//2�� �����ڰ� ��¹��
            arr2.add(4);
            arr2.add(2);
            arr2.add(5);

        }

        int result2[] = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            result2[i] = arr2.get(i);  //������2 �� ArrayList�� �迭�� ��ȯ
        }

        for (int i = 0; i < answers.length; i++) {
            arr3.add(3);
            arr3.add(3);
            arr3.add(1);
            arr3.add(1);
            arr3.add(2);
            arr3.add(2);	//3�� �����ڰ� ��¹��
            arr3.add(4);
            arr3.add(4);
            arr3.add(5);
            arr3.add(5);
        }

        int result3[] = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            result3[i] = arr3.get(i); //������3���� ArrayList �迭�κ�ȯ
        }
        //������ 1~3 ���������
        for (int j = 0; j < answers.length; j++) {
            if (answers[j] == result[j]) {
                count++;
            }
        }

        for (int j = 0; j < answers.length; j++) {
            if (answers[j] == result2[j]) {
                count2++;
            }
        }
        for (int j = 0; j < answers.length; j++) {
            if (answers[j] == result3[j]) {
                count3++;
            }
        }
int max = Math.max(Math.max(count, count2), count3); //�ִ� ����� max

  ArrayList<Integer> list = new ArrayList<>();//��ȯ�� ArrayList �����

        if (max == count)
            list.add(1);
        if (max == count2)
            list.add(2);
        if (max == count3)
            list.add(3); //���� ���� ���� ��� ArrayList�� �ֱ�

            solutions = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            solutions[i] = list.get(i);
        }
            return solutions;
    }
}


