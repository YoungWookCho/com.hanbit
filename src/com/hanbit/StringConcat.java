package com.hanbit;


public class StringConcat {
	
	public static void main(String[] args) {
		String firstName = "이버";
		String lastName = "네";
		//concat 함수를 사용해 네이버 출력
		System.out.println(concat(lastName,firstName));
		System.out.println(concat(new String[]{"이","상","윤"}));
		System.out.println(checkSpecialCharater("#"));
		System.out.println(concatExcludeSpecialCharater(new String[]{"이","상","$","#","*","윤"}));
		System.out.println(concatUntilSharp(new String[] {"이", "$", "상", "#", "*", "윤"}));
		System.out.println(concatUntilLSY(new String[] {"이", "상", "윤", "#", "*"}));
		System.out.println(concatExcludeSpecialCharacterUntilPlus(new String[] {"이", "$", "상", "#", "+", "윤"}));
		
	}

	
	//함수명이 concat 이고 두개의 String을 받아
	//두 문자열을 합친 문자열을 반환 하는 함수를 작성하세요
	
	static String concat(String str1, String str2){
		
		return str1+str2;

	}
	
	static String concat(String[] strings){
		String result="";
		
		for ( int iCount=0; iCount < strings.length; iCount++ ){
			
			result=concat(result,strings[iCount]);

		}
		
		
		return result;
	}
	
	
	
	static boolean checkSpecialCharater(String str){
		
	
		if ( ("!".equals(str)) || ("@".equals(str)) || ("#".equals(str)) 
					|| ("$".equals(str)) ||("%".equals(str))){
				
				return true;
				
		}
		
		return false;
		
	}
	
	
	
	
	
	static String concatExcludeSpecialCharater(String[] strings) {
		
		String result="";
		
		for ( int iCount=0; iCount<strings.length; iCount++){
			if (checkSpecialCharater(strings[iCount])){
				continue;
			}
			result=concat(result,strings[iCount]);
			
		}
		
		return result;
		

		/*
		int notSpecialCharaterCount=0;
		String result="";
		
		for ( int iCount=0; iCount<strings.length; iCount++){
			
			if (!(checkSpecialCharater(strings[iCount]))){
					
				notSpecialCharaterCount++;
			}
			
		}
		
		
		String[] arrResult= new String[notSpecialCharaterCount];
		int arrResultCount=0;
		for ( int iCount=0; iCount<strings.length; iCount++){
			
			if (!(checkSpecialCharater(strings[iCount]))){
					
				arrResult[arrResultCount]=strings[iCount];
				arrResultCount++;
			}
			
		}
		
		
		
		result=concat(arrResult);
		
		return result;
		*/
	}
	
	
	
	/*
	 * 함수명: concatUntilSharp
	 * 매개변수: String[] strings
	 * 리턴타입: String
	 * 설명: 입력받은 문자열 배열의 모든 문자열을 합쳐서 반환합니다.
	 *       단, 문자열이 "#" 이면 더이상 합치지 않고 반환합니다.
	 * 예: concatUntilSharp(new String[] {"이", "$", "상", "#", "*", "윤"}) -> "이$상"
	 */
	
	static String concatUntilSharp (String[] strings) {
		
		String result="";
		
		for ( int iCount=0; iCount<strings.length; iCount++){
			
			if ( "#".equals(strings[iCount]) ){
				break;
			}

			result=concat(result,strings[iCount]);

		}
		
		return result;
		
	}
	
	/*
	 * 함수명: concatUntilLSY
	 * 매개변수: String[] strings
	 * 리턴타입: String
	 * 설명: 입력받은 문자열 배열의 모든 문자열을 합쳐서 반환합니다.
	 *       단, 합쳐진 문자열이 "이상윤" 이면 더이상 합치지 않고 반환합니다.
	 * 예: concatUntilLSY(new String[] {"이", "상", "윤", "#", "*"}) -> "이상윤"
	 */
	
	
	static String concatUntilLSY(String[] strings){
		
		String result="";
		
		for ( int iCount=0; iCount<strings.length; iCount++){
			
			result = concat(result,strings[iCount]);
			
			if ( "이상윤".equals(result) ){
				break;
			}


		}
		
		return result;
		
		
		
	}
	
	/*
	 * 함수명: concatExcludeSpecialCharacterUntilPlus
	 * 매개변수: String[] strings
	 * 리턴타입: String
	 * 설명: 입력받은 문자열 배열의 특수문자를 제외한 
	 *       모든 문자열을 합쳐서 반환합니다.
	 *       단, 문자열이 "+" 이면 더이상 합치지 않고 반환합니다.
	 * 예: concat(new String[] {"이", "$", "상", "#", "+", "윤"}) -> "이상"
	 * 제약사항: 특수문자는 !, @, #, $, % 만 체크합니다.
	 */
	
	
	static String concatExcludeSpecialCharacterUntilPlus(String[] strings){
		String result="";
		
		for ( int iCount=0; iCount<strings.length; iCount++){
			
			if("+".equals(strings[iCount])){
				break;
			}
			
			if (!checkSpecialCharater(strings[iCount])){

				result=concat(result,strings[iCount]);
			}
		}
		return result;
	}
	

	
	
	
	

}
