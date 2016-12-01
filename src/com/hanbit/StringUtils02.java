package com.hanbit;

public class StringUtils02 {
	
	
	/**	
	 * 주어진 문자열에서 시작인텍스와 끝인덱스 사이의 문자열을 반환합니다.
	 * 
	 * 예1: substring("hello",1,4) ->"ell"
	 * 예2: substring("hello",1,10) ->"ello"
	 * 예3: substring("hello",5,9) ->""
	 * 예4: substring("hello",-1,4) ->null
	 * @param str
	 * @param beginIndex
	 * @param endIndex
	 * @return
	 */
	static String substring (String str, int beginIndex, int endIndex){
		
		if (beginIndex<0 || str==null ||endIndex<0){
			return null;
		}
		

		
		if (str.length() <= beginIndex || beginIndex>=endIndex){
			return "";
			
		}
		
		endIndex=endIndex>str.length()?str.length():endIndex;


		
		
		char[] chars=str.toCharArray();
		String result="";
	
		for(int i =beginIndex; i<endIndex; i++){

			result+=chars[i];
			
		}

		return result;
		
	}
	
	// 같은것 선언 실수 
	
	static String substring (String str, int beginIndex){
		
		return str==null?null:substring(str,beginIndex,str.length());
		
	}
	
	
	/**
	 * 입력받은 문자열에서 구분자로 받은 문자열 뒤의 문자열을 반환합니다.
	 * 
	 * 예1: substringAfter("hello world", "hello") -> " world"
	 * 예2: substringAfter("banana", "ba") -> "nana"
	 * 예3: substringAfter("banana", "B") -> ""
	 * 예4: substringAfter("banana", null) -> ""
	 * 
	 * @param str
	 * @param separator 구분자
	 * @return
	 */
	static String substringAfter(String str, String separator) {
		
		if(str==null){
			return null;
		}

		int pos=StringUtils00.indexOf(str,separator);
		
		if (pos==-1){
			
			return "";		
			
		}
		return substring(str,pos+separator.length());
		
	}
	
	
	static String substringBefore(String str, String separator) {
		
		if(str==null){
			return null;
		}

		int pos=StringUtils00.indexOf(str,separator);
		
		if (pos==-1){
			return "";		
		}
		return substring(str,0,pos);
		
	}
	
	
	/**
	 * 입력받은 문자열에서 구분자로 받은 각 문자열 사이의 문자열을 반환합니다.
	 * 
	 * 예1: substringBetween("<div>hello</div>", "<div>", "</div>") -> "hello"
	 * 예2: substringBetween("<div>hello</div>", null, "</div>") -> null
	 * 예3: substringBetween("<div>hello</div>", "<div>", null) -> null
	 * 예4: substringBetween("chars[304]", "[", "]") -> "304"
	 * 
	 * @param str
	 * @param open
	 * @param close
	 * @return
	 */
	
	static String substringBetween (String str, String open, String close){
		
		if (open==null || close==null ||str==null){
			return null;
		}
		
		return substringBefore(substringAfter(str,open),close);
			
	}
	
	
	
	
	static String substringBetween (String str, String tag){
		
		if (tag==null ||str==null){
			return null;
		}
		
		return substringBetween(str,tag,tag);
	}
			
	

}
