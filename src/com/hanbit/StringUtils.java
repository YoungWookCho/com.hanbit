package com.hanbit;

public class StringUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse 함수를 사용하여 다음 문자열을 뒤집어 출력하세요.
		/*
		String fruit = "banana";
		
		System.out.println(reverse(fruit));
		
		
		System.out.println("is Blank: "+isBlank(null));
		System.out.println("\\");
		
		System.out.println("isDigit: "+isDigit('9'));
		System.out.println("isAlphabet: "+isAlphabet('/'));
		System.out.println("isAlaphaOrDigit: "+isAlaphaOrDigit("hello123/"));
		System.out.println(removeChar(null,'e'));
		*/
		System.out.println(removeStr("banananananaa","na"));
		
		
	}
	
	/*
	 * 함수명: removeStr
	 * 매개변수1: String str
	 * 매개변수2: String rmStr
	 * 리턴타입: String
	 * 설명: 입력받은 문자열에서 주어진 문자열을 삭제하고 반환합니다.
	 * 예1: removeStr("hello", "ll") -> "heo"
	 * 예2: removeStr("java", "av") -> "ja"
	 * 예3: removeStr(null, "334") -> null
	 * 예4: removeStr("hanbit", "hans") -> "hanbit"
	 * 예5: removeStr("banana", "na") -> "ba"
	 */
	
	static String removeStr(String str, String rmStr){
		
		if (str==null) {
			return null;
			
		}
		if (rmStr==null || "".equals(rmStr) || rmStr.length()>str.length()){
			
			return str;
		}
		
		char[] strChars = str.toCharArray();
		char[] rmStrChars = rmStr.toCharArray();
		
		int strCharsLen= strChars.length;
		int rmStrCharsLen= rmStrChars.length;
		
		String result="";
		
		
		for (int i =0; i<strCharsLen; i++){
			boolean match = false;
			
			if (strChars[i]==rmStrChars[0]) {
				for (int j=0; j<rmStrCharsLen; j++){
					if (j+i<strCharsLen && strChars[j+i]==rmStrChars[j]){
						match=true;						
					}
					else{
						match=false;
						break;
					}
				}
			}
			if (match){
				i+=rmStrCharsLen-1;
			}
			else{
				result+=strChars[i];
			}
			
			
			
		}
		return result;
		
		
		
		
		
		
		
	}
	
	
	
/*	
	static String removeStr(String str, String rmStr){
		
		if (str==null){
			return null;
		}
		if(rmStr == null || "".equals(rmStr) || str.length() < rmStr.length()){
			return str;
		}
		
		char[] strChars = str.toCharArray();
		char[] rmStrChars = rmStr.toCharArray();
		int strCharsLen= strChars.length;
		int rmStrCharsLen= rmStrChars.length;
		
		String result="";
		
		for (int i = 0; i<strCharsLen; i++){
			boolean match= true;
			
			if (strChars[i] != rmStrChars[0]){
				match= false;
			}
			
			else if (strCharsLen-i<rmStrCharsLen){
				match=false;
			}
			else{
				
				for (int j = 0; j<rmStrCharsLen; j++){
					
					if (strChars[i+j] != rmStrChars[j]){
						match = false;
						break;
					}
				}				
			}
			
			if (match){
				i+=rmStrCharsLen-1;
			}
			else{
				result+=strChars[i];
			}
			
		}
		return result;
		
	}		
		
*/		
		

		/*
	
		for (int i =0; i<strCharsLen; i++){
			
			if (strChars[i]==rmStrChars[0]){
				
				for (int j =0 ; j<rmStrCharsLen; j++){
					
					if (i<strCharsLen){
						
					}
					if (strChars[i+j] == rmStrChars[j]){
						flag= true;
						
						if(flag){
							pos=i;
							break;
						}
					}
					else {
						flag= false;
					}
				}

			}

		}
		
		
		
		String result="";
		for (int k =0; k<strCharsLen; k++){
			
			if (!(k>=pos && k<=rmStrCharsLen+pos)){
				result+=strChars[k];
			}	
		}
		return result;	
		
		*/

	
	
	
	
	
	static String removeChar(String str, char ch){
		
		if (str==null){
			return "null";
		}
		String newStr="";
		char[] chars = str.toCharArray();
		
		for (int i =0; i<chars.length; i++){
			
			if(!(chars[i] ==ch) ){
				
				newStr=newStr+chars[i];
			}		
					
		}
		return newStr;
			
}
		

	
	
	
	
	
	
	static boolean isAlaphaOrDigit(String str){
		char [] chars = str.toCharArray();
		
		for (int i = 0; i<chars.length; i++){
			
			char elemnet=chars[i];
			
			if (!(isAlphabet(elemnet)||isDigit(elemnet))){
				return false;				
			}			
		}
		return true;
		

		
		
	}
	
	
	 
	
	static boolean isAlphabet(char ch){
		
		return (ch>64 && ch<91) || (ch>96 && ch<123);
		
	}
	
	
	
	
	static boolean isDigit(char ch){
	
		return ch>47 && ch<58;

	}
	
	
	
	
	static boolean isBlank(String str){
		boolean isEmpty = isEmpty(str);
		
		if (isEmpty){
			return true;
		}
		
		char[] chars= str.toCharArray();
		
		if (!isEmpty){
			
			for (int i =0 ; i< chars.length; i++){
				if (!isWhitespace(chars[i])){
					return false;
				}
			}
		}
		return true;
	}
	
	
	
	static boolean isWhitespace(char ch){
		
		return ch==32 || ch==13 || ch==9 || ch==10;
		
	}
	
	
	
	
	
	
	
	
	
	static boolean isEmpty (String str){
		// null 부터 체크 한는 이유는 조건 검사를 할때 널일때 검사를 먼저 하지 않기 때문에 에러가 남;
		if (str==null || "".equals(str)){
			return true;
		}
		return false;
		
	}
	
	
	
	
	
	
	
	
	/*
	 * 함수명: reverse
	 * 매개변수: String str
	 * 리턴타입: String
	 * 설명: 입력받은 문자열을 뒤집어 반환합니다.
	 *       단, 문자열이 null 이면 null을 반환합니다.
	 * 예1: reverse("hello") -> "olleh"
	 * 예2: reverse(null) -> null
	 * 예3: reverse("") -> ""
	 */
	
	static	String  reverse(String str){
		
		String result="";
		
		if ( str==null){
			return "null";
		}
		
		char []chars = str.toCharArray();
		
		//char []newChars = new char[chars.length];
		
		for (int i =0 ; i<chars.length; i++){
			
			//newChars[chars.length-i-1]=chars[i];
			result = chars[i]+result;
		}
		
		//result= new String(newChars,0,newChars.length);
		
		//return "\""+result+"\"";
		
		return "\""+result+"\"";

	}
	
	
	
	
}