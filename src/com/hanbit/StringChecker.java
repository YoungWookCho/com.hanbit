package com.hanbit;

public class StringChecker {
	
	
	public static void main(String[] args) {
		System.out.println(hasNumber("hihihihihi"));
	}
	/*
	 * 함수명: hasNumber
	 * 매개변수1: String str
	 * 리턴타입: boolean
	 * 설명: 문자열을 입력받아 숫자를 포함하고 있는지 여부를 반환합니다.
	 * 힌트1: char[] chars = str.toCharArray();
	 * 힌트2: if (chars[i] == '3') { ... }
	 */
	
	static boolean hasNumber(String str){
		
		
		char[] chars = str.toCharArray();
		
		
		for (int iCount=0; iCount<chars.length; iCount++){
			
			if (chars[iCount] >='0' && chars[iCount]<='9'){
				
				return true;
				
			}

		}
		
		return false;

	}
	

}
