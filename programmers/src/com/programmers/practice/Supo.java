package com.programmers.practice;
//수포자 3명중 정답 가장 맞춘 사람 배열에 넣기. 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
//가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성하기
import java.util.ArrayList;

public class Supo {
	
	public int[] solution(int[] answers) {
        int solutions[] = {};//출력할 배열

        ArrayList<Integer> arr1 = new ArrayList<>(); //수포자 1의 ArrayList
        ArrayList<Integer> arr2 = new ArrayList<>(); //수포자 2의 ArrayList
        ArrayList<Integer> arr3 = new ArrayList<>(); //수포자 3의 ArrayList

        int count = 0; //수포자1 정답수 
        int count2 = 0;//수포자2 정답수 
        int count3 = 0;//수포자3 정답수 
        					//전체 문제수만큼 반복해서 넣기
        for (int i = 0; i < answers.length; i++) {
            arr1.add(1);
            arr1.add(2);
            arr1.add(3);
            arr1.add(4);//1반 수포자가 찍는방식
            arr1.add(5); // 수포자 배열에 찍는 값 넣기
        }

        int result[] = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            result[i] = arr1.get(i); //수포자1의 ArrayList를 배열로 변환
        }
        for (int i = 0; i < answers.length; i++) {
            arr2.add(2);
            arr2.add(1);
            arr2.add(2);
            arr2.add(3);
            arr2.add(2);	//2번 수포자가 찍는방식
            arr2.add(4);
            arr2.add(2);
            arr2.add(5);

        }

        int result2[] = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            result2[i] = arr2.get(i);  //수포자2 의 ArrayList를 배열로 변환
        }

        for (int i = 0; i < answers.length; i++) {
            arr3.add(3);
            arr3.add(3);
            arr3.add(1);
            arr3.add(1);
            arr3.add(2);
            arr3.add(2);	//3번 수포자가 찍는방식
            arr3.add(4);
            arr3.add(4);
            arr3.add(5);
            arr3.add(5);
        }

        int result3[] = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            result3[i] = arr3.get(i); //수포자3까지 ArrayList 배열로변환
        }
        //수포자 1~3 정답수세기
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
int max = Math.max(Math.max(count, count2), count3); //최대 정답수 max

  ArrayList<Integer> list = new ArrayList<>();//빈환할 ArrayList 만들기

        if (max == count)
            list.add(1);
        if (max == count2)
            list.add(2);
        if (max == count3)
            list.add(3); //가장 많이 맞힌 사람 ArrayList에 넣기

            solutions = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            solutions[i] = list.get(i);
        }
            return solutions;
    }
}


