package com.hanbit;

public class StringUtils00 {

	public static void main(String[] args) {
		
		System.out.println(compare("ab","ABC"));
	

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
	 * 설명: 두개의 문자열을 입력받아 왼쪽이 크면 1,
	 *       오른쪽이 크면 -1, 같으면 0을 반환합니다.
	 */
	
	static int compare(String left, String right){
		
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

		
		
		for (int i = 0; i<leftChars.length; i++){
			

			// 레프트와 라이트를 비교 후 같았을때 왼쪽의 길이가 더 길면

		
			
			if (i >= rightChars.length){
				return 1;
			}
			
			// 왼쪽 이 클때
			if ( leftChars[i]>rightChars[i]){
				return 1;
			}
			//오른쪽이클때
			else if ( leftChars[i]<rightChars[i]){
				return -1;
			}
		
		}
		// 포문 통과 같다는 이야기 레프트를 다 조사했을때
		
		// 그래서 오른쪽의 길이가 더 크면 오른쪽이 큼
		if(leftChars.length < rightChars.length){
			return -1;
		}
		// 위의 것도 아니라면 같은것 
		return 0;

		
	}
	
	
	
	

}
