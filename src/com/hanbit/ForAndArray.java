package com.hanbit;

public class ForAndArray {

	public static void main(String[] args) {

		// 1. 시작월부터 12월까지의 월명을 배열로 반환하세요.
		//  ex: startMonth = 3 -> {"3월", "4월", ... , "12월"}
		int startMonth = 3;
		String[] monthNames = getMonthNames(startMonth);
		
		for (String monthName : monthNames) {
			System.out.println(monthName);
		}
		
		
		// 2. 주어진 배열의 부분 배열을 반환하는 함수를 작성하세요.
		int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int startIndex = 8;	// 시작인덱스
		int length = 4;		// 부분 배열의 길이
		int[] subNumbers = getSubArray(numbers, startIndex, length);
		
		System.out.print("[");
		for (int i=0;i<subNumbers.length;i++) {
		//int i = 0;
		//for ( int subNumber : subNumbers) {
			
			if (i > 0) {
				System.out.print(", ");
			}
			
			System.out.print(subNumbers[i]);
			
		}
		System.out.println("]");
		
		
		
	
		// 3. AB형이 아닌 혈액형만 출력하세요.
		String[] bloodTypes = new String[] {"A", "B", "AB", "O"};
		printPureBloodType(bloodTypes);
		
		// 4. 배열의 길이와 첫번째 숫자를 입력받아
		//    1씩 증가하는 숫자로 채워진 배열을 반환하세요.
		int arrayLength = 10;
		int firstNumber = 7;
		int[] numberArray = createArray( arrayLength, firstNumber);
		
		System.out.print("[");
		int iCount=0;
		
		for (int number : numberArray){
			if ( iCount > 0 ){
				System.out.print(", ");
			}
			iCount++;
			
			System.out.print(number);
		}
		System.out.print("]");

	}
	
	
	
	

		static int[] createArray(int arrayLength, int firstNumber) {
		// TODO Auto-generated method stub
			
			int [] arrResult= new int[arrayLength];
			
			for (int iCount=0; iCount<10; iCount++){
				
				arrResult[iCount]=firstNumber+iCount;
				
			}
			
			
		return arrResult;
	}





	static void printPureBloodType(String[] bloodTypes) {
		// TODO Auto-generated method stub
		for (int iCount=0; iCount<bloodTypes.length; iCount++) {
			
			
			//만약에 아래처럼 적으면 변수가 변해서 널이 들어가게 되면 에러가 뜸 안티 패턴
			//!(bloodTypes[iCount].equals("AB"))
			if (!("AB".equals(bloodTypes[iCount]))){
				
				System.out.print(bloodTypes[iCount]);
			}
			
		}
		
		System.out.println();
	}





	static int[] getSubArray(int[] array, int startIndex, int length) {
		// TODO Auto-generated method stub
		
		
		int[] arrResult=new int[length];
		
		for ( int iCount=0; iCount<length; iCount++){
			
			if (iCount+startIndex>=array.length) {
				
				break;
				
			}
			
			arrResult[iCount]=array[startIndex+iCount];
			
		}
		return arrResult;
	}
	
	
	
	
	
	

	static String[] getMonthNames(int startMonth) {
		
		
		String[] arrStrMonth= new String[12-startMonth+1];

		
		for (int iCount=0; iCount<arrStrMonth.length;iCount++){
			arrStrMonth[iCount] = (startMonth+iCount) + "월";
			
		}
		return arrStrMonth;
	}
}
