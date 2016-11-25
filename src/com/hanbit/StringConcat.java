package com.hanbit;


public class StringConcat {
	
	public static void main(String[] args) {
		String firstName = "이버";
		String lastName = "네";
		//concat 함수를 사용해 네이버 출력
		System.out.println(concat(lastName,firstName));
		
	}

	
	//함수명이 concat 이고 두개의 String을 받아
	//두 문자열을 합친 문자열을 반환 하는 함수를 작성하세요
	
	static String concat(String str1, String str2){
		
		return str1+str2;

	}
	
	

}
