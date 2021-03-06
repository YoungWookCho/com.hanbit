package com.hanbit;

public class NumberUtils {

	public static void main(String[] args) {
		int x = 8;
		int y = 10;
		
		// compare를 사용하여 결과값을 출력하세요.
		// 출력: compare(x, y)의 결과는 ? 입니다.
		int result = compare( x , y );
		
		System.out.println("compare (x,y)의 결과는 "+result+"입니다.");
		
		//String restult = "compare (x,y)의 결과는 "+result+"입니다.";
		//String result = "compare (x,y)의 결과는" ;
		//result = +compare (x,y)+"입니다.";
		
		// isNumber를 사용하여 다음 문자열이 숫자인지 출력하세요.
		// 출력: ? 은 숫자입니다. / ? 은 숫자가 아닙니다.
		String str = "-0.56";
		
		if (isNumber(str)){
			System.out.println(str+"은 숫자입니다.");
			
		}
		else {
			System.out.println(str+"은 숫자가 아닙니다.");
		}
		// max 함수를 사용하여 가장 큰 값을 구하시오.
		// 출력: 가장 큰 수는 ? 입니다.
		int[] numbers = new int[] {-2, -39, -55, -193, -98, -1};
		System.out.println("가장큰수는 "+max(numbers)+"입니다.");
		
		// min 함수를 사용하여 가장 큰 값을 구하시오.
		// 출력: 가장 큰 수는 ? 입니다.
		
		System.out.println("가장 작은수는 "+min(numbers)+"입니다.");
		
		
		System.out.println(stringToInt("9.9"));
		
		System.out.println(plusStringValue("100",""));

		
	}
	/*
	 * 함수명: stringToInt
	 * 매개변수: String str
	 * 리턴타입: int
	 * 설명: 숫자형태의 문자열을 입력받아 정수형태로 반환합니다.
	 *       단, 숫자형태가 아니면 0을 반환합니다.
	 * 예1: stringToInt("123") -> 123
	 * 예2: stringToInt("0011") -> 11
	 * 예3: stringToInt("9.9") -> 9
	 * 예3: stringToInt("5시") -> 0
	 */	
	
	static int stringToInt(String str) {
		if (!isNumber(str)) {
			return 0;
		}
		
		char[] chars = str.toCharArray();
		int newLength = 0;
		boolean negative = false;
		
		for (int i=0;i<chars.length;i++) {
			if (chars[i] == '.') {
				break;
			}
			else if (chars[i] == '-') {
				negative = true;
				continue;
			}
			
			newLength++;
		}
		
		char[] newChars = new char[newLength];
		int startPos = 0;
		
		if (negative) {
			startPos = 1;
		}
		
		for (int i=startPos;i<newChars.length + startPos;i++) {
			newChars[i - startPos] = chars[i];
		}
		
		int result = 0;
		
		for (int i=0;i<newChars.length;i++) {
			char ch = newChars[i];
			int pos = newChars.length - i;
			int num = 0;
			
			if (ch == '0') {
				continue;
			}
			else if (ch == '1') {
				num = 1;
			}
			else if (ch == '2') {
				num = 2;
			}
			else if (ch == '3') {
				num = 3;
			}
			else if (ch == '4') {
				num = 4;
			}
			else if (ch == '5') {
				num = 5;
			}
			else if (ch == '6') {
				num = 6;
			}
			else if (ch == '7') {
				num = 7;
			}
			else if (ch == '8') {
				num = 8;
			}
			else if (ch == '9') {
				num = 9;
			}
			
			for (int j=1;j<pos;j++) {
				num *= 10;
			}
			
			result += num;
		}
		
		if (negative) {
			result *= -1;
		}
		
		return result;
	}
	
	/*
	 * 함수명: plusStringValue
	 * 매개변수1: String str1
	 * 매개변수2: String str2
	 * 리턴타입: int
	 * 설명: 두개의 숫자형태의 문자열을 받아 각 문자열의 숫자값의 합을 반환합니다.
	 * 예1: plusStringValue("23", "53") -> 76
	 * 예2: plusStringValue("45", "5시") -> 45
	 
	*/
	static int plusStringValue (String str1, String str2){
		
		
		return stringToInt(str1)+stringToInt(str2);
		
		
	}
	
	
	
	
	
	
	/*
	 * 함수명: stringToInt
	 * 매개변수: String str
	 * 리턴타입: int
	 * 설명: 숫자형태의 문자열을 입력받아 정수형태로 반환합니다.
	 *       단, 숫자형태가 아니면 0을 반환합니다.
	 * 예1: stringToInt("123") -> 123
	 * 예2: stringToInt("0011") -> 11
	 * 예3: stringToInt("9.9") -> 9
	 * 예3: stringToInt("5시") -> 0
	 
	
	static int stringToInt( String str ){
		
		
		int sum = 0;
		if (! isNumber(str) ){
			return 0;
		}
		
		boolean negative= false;
		int newLength = 0;
		char[] chars= str.toCharArray();
		
		for ( int i=0;  i<chars.length; i++ ){
			
			if ( chars[i] == '.'){
				break;
			}
			
			else if (chars[i] =='-') {
				negative = true;
				continue;
			}
			
			newLength++;
		}
		

		
		int startPos = 0;
		
		if (negative){
			startPos=1;
		}
		
		
		char[] newChars = new char[newLength];
		
		for (int j =startPos; j<newChars.length+startPos; j++){
			
			newChars[j-1]=chars[j];
			
		}
			
		for (int iCount = 0; iCount < newChars.length ; iCount++){
				
			 char cha=newChars[iCount];
			 int pos = newChars.length-1;
			 int num=0;
				 
				 
				if (cha=='0'){
					 
					continue;
	 
				 }
				
				 else if (cha=='1'){
					 
					 num=1;
					 
				 }
				 else if (cha=='2'){
					 
					 num=2;
					 
				 }
				 else if (cha=='3'){
					 
					 num=3;
					 
				 }
				 else if (cha=='4'){
					 
					 num=4;
					 
				 }
				 else if (cha=='5'){
					 
					 num=5;
					 
				 }
				 else if (cha=='6'){
					 
					 num=6;
					 
				 }
				 else if (cha=='7'){
					 
					 num=7;
					 
				 }
				 else if (cha=='8'){
					 num=8;
					
					 
				 }
				 else if (cha=='9'){
					 
					 num=9;
					 
				 }
				
				for (int k=1; k < pos; k++){
					num*=10;
					
				}
				
				sum +=num ; 
				
		}
			
			
		
		
		
	return sum;
		
		
}
	
	*/
	
	
	
	
	
	
	static int min (int [] numbers){
		
		int min = Integer.MAX_VALUE;
		
		for (int iCount =0; iCount < numbers.length; iCount++){
			int number = numbers[iCount];
			
			if ( min > number){
				min = number;
			}			
		}
		return min;

	}
	
	
	
	
	static int max (int [] numbers){
		
		int max = Integer.MIN_VALUE;
		//int max =0;
		for (int iCount =0; iCount < numbers.length; iCount++){
			int number = numbers[iCount];
			
			if ( max < number){
				max = number;
			}			
		}
		return max;

	}
	
	
	
	
	/*
	 * 함수명: compare
	 * 매개변수: int left
	 * 매개변수: int right
	 * 리턴타입: int
	 * 설명: 두개의 정수를 입력받아 왼쪽정수가 크면 1
	 *       오른쪽 정수가 크면 -1, 같으면 0을 반환합니다.
	 * 예1: compare(1, 4) -> -1
	 * 예2: compare(50, 4) -> 1
	 * 예3: compare(7, 7) -> 0
	 */
	static int compare( int left, int right ){
		
		if ( left > right){
			return 1;
		}
		else if( left == right ) {
			return 0;
		}
		else {
			return -1;
		}

	}
	
	
	/*
	 * 함수명: isNumber
	 * 매개변수: String str
	 * 리턴타입: boolean
	 * 설명: 입력받은 문자열이 숫자 형태인지 여부를 반환합니다.
	 * 예1: isNumber("123") -> true
	 * 예2: isNumber("0.3") -> true
	 * 예3: isNumber("4시") -> false
	 */
	
	static boolean isNumber (String str){
		
		char [] arrChars= str.toCharArray();
		boolean negative = false;
		boolean hasPoint = false;
		
		
		for (int iCount=0; iCount<arrChars.length; iCount++ ){
			char ch = arrChars[iCount];
			
			if ( !(ch>='0' && (ch<='9'))) {
				
			
				if ( ch=='-' && iCount==0) {
					negative = true;
					continue;
					}
				
				int pointMinPosition = 0;
				
				if ( negative ){
					pointMinPosition=1;
				}
				
				
				if ( iCount > pointMinPosition && ch == '.' && !hasPoint ){
					
					if ( iCount == arrChars.length -1 ) {
						return false;
					}
					hasPoint = true;
					continue;
				}
				return false;
			}
		}

		return true;
		
	}
	
	
	


}
