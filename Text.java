package com.xiang.practice02;

public class Text {

	public static void main(String[] args) {
		SingleChoice singleChoice = new SingleChoice("�����������˭��",new String[]{"1������˹̹","2��������","3���ϼ���","4�����Լ�"},4);
		boolean result = singleChoice.check(new int[]{4});
		System.out.println(result);
		
		MultiChoice multiChoice = new MultiChoice("�����������˭��", new String[]{"1������˹̹","2��������","3���ϼ���","4�����Լ�"}, new int[] {1,2,3});
		boolean result2 = multiChoice.check(new int[] {1,2,3});
		System.out.println(result2);
	}
}
