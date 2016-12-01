package com.hanbit;

public class StringUtils000 {

	public static void main(String[] args) {
		
		System.out.println(compare("ab","ABC",true));
		System.out.println(contains(null,null));
		System.out.println(countMatches("banana","an"));


	}
	
	/*
	 * 함수명: countMatches
	 * 매개변수1: String str
	 * 매개변수2: String search
	 * 리턴타입: int
	 * 설명: 입력받은 문자열에 검색할 문자열이 몇번 포함되었는지 반환합니다.
	 * 예1: countMatches("banana", "an") -> 2
	 * 예2: countMatches("apple", "led") -> 0
	 * 예3: countMatches("apple", "ap") -> 1
	 * 예4: countMatches("hanbit", "NB") -> 0
	 * 예5: countMatches(null, null) -> 0
	 */
	
static int countMatches (String str, String search){

		
		if (search==null ||str==null || "".equals(search) || search.length()>str.length()) {
			return 0;
			
		}
		
		char[] strChars = str.toCharArray();
		char[] rmStrChars = search.toCharArray();
		
		int strCharsLen= strChars.length;
		int rmStrCharsLen= rmStrChars.length;
		
		
		int iCount=0;
		
		for (int i =0; i<strCharsLen; i++){
			boolean match = false;
			if (strChars[i]==rmStrChars[0]) {
				
				for (int j=1; j<rmStrCharsLen; j++){
					
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
				iCount++;
			}

		}
		return iCount;
	}
	
	
	
	/*
	 * 함수명: contains
	 * 매개변수1: String str
	 * 매개변수2: String search
	 * 리턴타입: boolean
	 * 설명: 입력받은 문자열에 검색할 문자열이 있으면 true, 없으면 false를 반환합니다.
	 * 예1: contains("banana", "an") -> true
	 * 예2: contains("apple", "led") -> false
	 * 예3: contains(null, null) -> false
	 */
	
	static boolean contains (String str, String search){

		
		if (search==null ||str==null || "".equals(search) || search.length()>str.length()) {
			return false;
			
		}

		char[] strChars = str.toCharArray();
		char[] rmStrChars = search.toCharArray();
		
		int strCharsLen= strChars.length;
		int rmStrCharsLen= rmStrChars.length;
		
		
		
		for (int i =0; i<strCharsLen; i++){
			boolean match = false;
			if (strChars[i]==rmStrChars[0]) {
				
				for (int j=1; j<rmStrCharsLen; j++){
					
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
				return true;
			}

		}
		return false;
	}
	
	
	
	static String toLowerCase(String str){
		
		if (str == null){
			
			return null;
		}
		
		char[] chars = str.toCharArray();
		String result="";
		
		for (int i =0 ; i<chars.length; i++){
			result+=toLowerCase(chars[i]);
		}
		
		return result;
		
	}
	
	static String toUpperCase(String str){
		
		if (str == null){
			
			return null;
		}
		
		char[] chars = str.toCharArray();
		String result="";
		
		for (int i =0 ; i<chars.length; i++){
			result+=toUpperCase(chars[i]);
		}
		
		return result;
	}
	
	
	static String switchCase(String str){
		
		if (str == null){
			
			return null;
		}
		
		char[] chars = str.toCharArray();
		String result="";
		
		for (int i =0 ; i<chars.length; i++){
			result+=switchCase(chars[i]);
		}
		
		return result;
	}
		

	
	
	static char toLowerCase(char ch){
		
		if ('A'<=ch && 'Z'>=ch){
			return (char)(ch+32);
		}	
		return ch;
		
	}
	
	static char toUpperCase(char ch){
		
		if ('a'<=ch && 'z'>=ch){
			
			return (char)(ch-32);
		}
		return ch;

		
	}
	
	
	
	
	
	
	
	
	
	static char switchCase(char ch){
		
		int result=0;
			
			if ('A'<=ch && 'Z'<=ch){
				result= ch+32;
			}
			else if ('a'<=ch && 'z'<=ch){
				result= ch-32;
			}
			else{
				return ch;
			}
		
		return (char)result;
	}
	
	
	
	
	/*
	 * 함수명: compare
	 * 매개변수1: String left
	 * 매개변수2: String right
	 * 리턴타입: int
	 * 설명: 두개의 문자열을 입력받아 왼쪽이 크면 양수,
	 *       오른쪽이 크면 음수, 같으면 0을 반환합니다.
	 */
	
	static int compare(String left, String right, boolean ignoreCase){
		
		if (left != null && right == null){
			return 1;
		}
		else if (left == null && right != null){
			return -1;
		}
		else if (left == null && right == null){
			
			return 0;			
		}
				
		char [] leftChars= left.toCharArray();
		char [] rightChars= right.toCharArray();

		
		if(ignoreCase){
			// 메소드를 이용한 함수
			left = toLowerCase(left);
			right = toUpperCase(right);
		}

		
		/*	 대소문자 풀어서 쓴것 위에 메소드 함수를 이용하면 됨.
		 * 
		for (int j =0; j<leftChars.length;j++){
				
			if ('A'<=leftChars[j] && 'Z'>=leftChars[j]){
				leftChars[j]=(char)(leftChars[j]+32);
			}				
		}
		
		
		
		for (int j =0; j<rightChars.length;j++){
			
			if ('A'<=rightChars[j] && 'Z'>=rightChars[j]){
				rightChars[j]=(char)(rightChars[j]+32);
			}				
		}

		*/
		
		for (int i = 0; i<leftChars.length; i++){
			

			// 레프트와 라이트를 비교 후 같았을때 왼쪽의 길이가 더 길면

			if (i >= rightChars.length){
				return 1;
			}
			/*
			// 왼쪽 이 클때
			if ( leftChars[i]>rightChars[i]){
				return 1;
			}
			//오른쪽이클때
			else if ( leftChars[i]<rightChars[i]){
				return -1;
			}
			*/
			if ( leftChars[i]!=rightChars[i]){
				return leftChars[i]-rightChars[i];
			}
		
		}
		// 포문 통과 같다 레프트를 다 조사했을때
		/*
		// 그래서 오른쪽의 길이가 더 크면 오른쪽이 큼
		if(leftChars.length < rightChars.length){
			return -1;
		}
		// 위의 것도 아니라면 같은것 
		return 0;
		 */
		//뭔가 하나더 필요함
		//return leftChars[i]-rightChars[i];
		
		return leftChars.length - rightChars.length;
		
	}
	
	
	
	

}
