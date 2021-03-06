package com.hanbit;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long time = System.nanoTime();
				System.out.println(time);
		System.out.println(time-System.nanoTime()+"ns"+":"+StringUtils01.trim("    st r  ")+":");
		time = System.nanoTime();
		System.out.println(time-System.nanoTime()+"ns"+":"+StringUtils01.trimFast("    st r  ")+":");
		System.out.println(StringUtils01.leftPad("11",4,'0'));
		System.out.println(StringUtils01.leftPad("asdf",2,'0'));
		System.out.println(StringUtils01.rightPad("11",4,'0'));
		System.out.println(StringUtils01.rightPad("asdf",2,'0'));
		System.out.println("substring: "+StringUtils02.substring("hello",1,4));
		
		System.out.println("substring2: "+StringUtils02.substring("hello",1));
		
		System.out.println("substringAfter: "+StringUtils02.substringAfter("hello", "e"));
		System.out.println("substringBefore: "+StringUtils02.substringBefore("hello wolrd","wolrd"));
		System.out.println("substringBetween: "+StringUtils02.substringBetween("chars[304]", "[", "}"));
		System.out.println("substringBetween: "+StringUtils02.substringBetween("char ch= 'z';", "'"));
		
		
		printArray(StringUtils03.split("이상윤|조영욱|||",'|'));
		printArray(StringUtils03.splitNotEmpty("이상윤|조영욱|||",'|'));
		
		printArray(StringUtils03.splitNotBlank("이상윤|조영욱|  | |", '|'));
		
		
		System.out.println("------------");
		printArray(StringUtils03.split("이상윤||조영욱|||", "||"));
		printArray(StringUtils03.splitNotBlankAndTrim("이상윤   ||   조영욱   ||  ||  |", "||"));
		
		
		
		
	}
	static void printArray(String[] array){
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
