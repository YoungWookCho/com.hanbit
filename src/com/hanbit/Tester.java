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
		
	}

}
