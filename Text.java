package com.xiang.practice02;

public class Text {

	public static void main(String[] args) {
		SingleChoice singleChoice = new SingleChoice("最聪明的人是谁？",new String[]{"1、爱因斯坦","2、爱迪生","3、毕加索","4、你自己"},4);
		boolean result = singleChoice.check(new int[]{4});
		System.out.println(result);
		
		MultiChoice multiChoice = new MultiChoice("最聪明的人是谁？", new String[]{"1、爱因斯坦","2、爱迪生","3、毕加索","4、你自己"}, new int[] {1,2,3});
		boolean result2 = multiChoice.check(new int[] {1,2,3});
		System.out.println(result2);
	}
}
