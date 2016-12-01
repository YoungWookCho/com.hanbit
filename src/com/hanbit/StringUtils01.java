package com.hanbit;



public class StringUtils01 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(trim("   st r   "));
	}
	
	
	
	
	
	

	static String rightPad(String str, int size, char ch){
		int stringLen = 0;
		if(str==null || str.length()>=size){
			return str;
		}
		stringLen=size-str.length();


		return str+repeat(stringLen,ch);
		
	}
	
	
	

	static String leftPad(String str, int size, char ch){
		int stringLen = 0;
		if(str==null || str.length()>=size){
			return str;
		}
		stringLen=size-str.length();


		return repeat(stringLen,ch)+str;
		
	}


 
	/**
	 * 길이와 문자를 입력 받아 길이만큼 문자를 반복한 문자영을 반환합니다.
	 * @param size 반복할길이
	 * @param ch 반복할 문자
	 * @return String 반복된 문자
	 *@deprecated 왠만하면 쓰지 말도록 하는 것 이런식으로 설정
	 */

	static String repeat(int size, char ch){
		
		String result="";
		for (int i =0; i<size; i++){
			result=result+ch;			
		}
		return result;
		
	}
	
	



	
	
	static String trim(final String str) {

		return rightTrim(leftTrim(str));

	}

	
	static String rightTrim(final String str) {
		char[] chars = str.toCharArray();
		String result = "";
		
		for(int i=0;i<chars.length;i++) {
			char ch = chars[chars.length - 1 - i];
			
			if (result.length() == 0 && StringUtils.isWhitespace(ch)) {
				continue;
			}
			
			result = ch + result;
		}
		return result;
	}
	
		
	
	static String leftTrim(final String str) {
		if (str == null) {
			return null;
		}
		
		char[] chars = str.toCharArray();
		String result = "";
		
		for (int i=0;i<chars.length;i++) {
			if (result.length() == 0 && StringUtils.isWhitespace(chars[i])) {
				continue;
			}
			
			result += chars[i];
		}
		
		return result;
	}
	
	
	
	static String removeWitespace(final String str){
		if(str==null){
			
			return null;
		}
		
		
		char[] chars= str.toCharArray();
		String result="";
		
		for (int i = 0; i  < chars.length; i++ ){

			if (StringUtils.isWhitespace(chars[i])){
				i++;
				continue;
				
			}
			else{
				result+=chars[i];
			}
		}
		return result;
	}
	
	
	
	static String trimFast(final String str) {
		if (str == null) {
			return null;
		}
		
		char[] chars = str.toCharArray();
		String result = "";
		String midWhitespaces = "";
		
		for (int i=0;i<chars.length;i++) {
			if (StringUtils.isWhitespace(chars[i])) {
				if (result.length() > 0) {
					midWhitespaces += chars[i];
				}
				
				continue;
			}
			
			result += midWhitespaces + chars[i];
			midWhitespaces = "";
		}
		
		return result;
	}
	
	

}
