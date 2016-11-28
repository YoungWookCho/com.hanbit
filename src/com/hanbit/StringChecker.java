package com.hanbit;



public class StringChecker {
	
	
	public static void main(String[] args) {
		String message = "Hello java";
		char ch = 'a';
		
		System.out.println(hasChar(message,'e')?ch+" 가 있습니다.":ch+" 가 없습니다.");
		
		int count = countChar(message,ch);
		System.out.println(ch+"가 "+count+"개 있습니다.");
		
		int index = indexOf(message,'e');
		System.out.println(ch+"가"+index+"번째에 있습니다.");
		
		message = "banana";
		int backIndex = lastIndexOf(message, ch);
		int frontIndex = indexOf (message, ch);
		
		System.out.println(ch+"가 앞에서"+frontIndex+"번째, 뒤에서 "+backIndex+"번째에 있습니다.");
		
		
		
		
		System.out.println(lastIndexOf("hello", 'l'));
		
		
		System.out.println(hasNumber("hihihihihi"));
		
		System.out.println(hasY("dfsgdsfg"));
		
		
		System.out.println(charAt("hanbit", 6));
		
	}
	
	/*
	 * 함수명: lastIndexOf
	 * 매개변수1: String str
	 * 매개변수2: char ch
	 * 리턴타입: int
	 * 설명: 문자열과 문자 1개를 입력받아 해당 문자의 위치를
	 *       뒤에서 부터 카운트하여 반환합니다.
	 *       단, 해당 문자가 없으면 -1 을 반환합니다.
	 * 예1: indexOf("hello", 'l') -> 3
	 * 예2: indexOf("hello", 'o') -> 4
	 * 예3: indexOf("christmas", 'd') -> -1
	 */
	
	
	static int lastIndexOf( String str, char ch){
		
		char[] chars = str.toCharArray();
		
		
		for (int iCount=chars.length-1; iCount>-1; iCount--){

			if(chars[iCount] ==ch ){
				
				return iCount;
			}
		}
		return -1;

		
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
	
	
	/*
	 * 함수명: hasChar
	 * 매개변수1: String str
	 * 매개변수2: char ch
	 * 리턴타입: boolean
	 * 설명: 문자열을 입력받아 문자를 포함하고 있는지 여부를 반환합니다.
	 * 힌트1: char[] chars = str.toCharArray();
	 * 힌트2: if (chars[i] == '3') { ... }
	 */
	
	static boolean hasChar( String str, char ch ){
		
		char[] chars = str.toCharArray();
		
		
		for (int iCount=0; iCount<chars.length; iCount++){
			// 문자열을 포함하고 있는것
			//if ((chars[iCount] >='a' && chars[iCount]<='z') || (chars[iCount] >='A' && chars[iCount]<='Z') ){
			//}
			// 같은 문자열인지 확인
			if(ch==chars[iCount]){
				return true;
			}
		}
		
		return false;
		
	}
	
	/*
	 * 함수명: hasY
	 * 매개변수: String str
	 * 리턴타입: boolean
	 * 설명: 문자열을 입력받아 'Y' 또는 'y'를 포함하고 있는지 여부를 반환합니다.
	 * 예1: hasY("Yes") -> true
	 * 예1: hasY("merry") -> true
	 * 예3: hasY("no") -> false
	 */
	
	static boolean hasY(String str){
		
		char[] chars = str.toCharArray();
		
		
		for (int iCount=0; iCount<chars.length; iCount++){

			if(chars[iCount] == 'Y' || chars[iCount] == 'y'){
				return true;
			}
		}
		
		return false;	
		
	}
	
	/*
	 * 함수명: countChar
	 * 매개변수1: String str
	 * 매개변수2: char ch
	 * 리턴타입: int
	 */
	
	static int countChar(String str, char ch){

		char[] chars = str.toCharArray();
		int iCharCounter = 0 ;
		
		for (int iCount=0; iCount<chars.length; iCount++){

			if(chars[iCount] == ch){
				
				iCharCounter++;
			}
		}
		return iCharCounter;
	}
	
	
	/*
	 * 함수명: indexOf
	 * 매개변수1: String str
	 * 매개변수2: char ch
	 * 리턴타입: int
	 * 설명: 문자열과 문자 1개를 입력받아 해당 문자의 위치를 반환합니다.
	 *       단, 해당 문자가 없으면 -1 을 반환합니다.
	 * 예1: indexOf("hello", 'e') -> 1
	 * 예2: indexOf("christmas", 'd') -> -1
	 */
	
	static int indexOf (String str, char ch){
		char[] chars = str.toCharArray();
		
		
		for (int iCount=0; iCount<chars.length; iCount++){

			if(chars[iCount] == ch){
				
				return iCount;
			}
		}
		return -1;
		
	}
	
	/*
	 * 함수명: charAt
	 * 매개변수1: String str
	 * 매개변수2: int index
	 * 리턴타입 char
	 */
	
	
	
	static char charAt(String str, int index){
		char[] chars = str.toCharArray();
		
		if (index > -1 && index < str.length()) {
			return chars[index];
		}
		else {
			return 0;
		}

	}
	/**
	 * @author 5CLASS-183
	 *
	 */
	
	
	
	
	
	
	
	

}
