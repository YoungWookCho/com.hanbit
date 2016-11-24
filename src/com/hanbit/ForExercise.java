package com.hanbit;

public class ForExercise {
	
	public static void main(String[] args) {
		
		
		// 1. 1부터 10까지의 합을 구하는 함수를 작성하세요.
		System.out.println(getSumOneToTen());
		
		// 2. 두개의 정수를 입력받아
		//    첫번째 수 부터 두번째 수까지의 합을
		//    구하는 함수를 작성하세요.
		int from = 1, to = 10;
		System.out.println(getSum(from, to));

		// 3. 두개의 정수를 입력받아
		//    첫번째 수 부터 두번째 수까지 중 짝수의 합을
		//    구하는 함수를 작성하세요.
		System.out.println(getSumOnlyEven(from, to));
		
		
	}

	static int getSumOnlyEven(int from, int to) {
		// TODO Auto-generated method stub
		
		int iCount=0;
		int iSum=0;
		
		for ( iCount=from; iCount<=to; iCount++){
			
			if ( iCount%2 == 0 ){
					iSum+=iCount;
				}
		}
		
		
		return iSum;
	}

	static int getSum(int from, int to) {
		// TODO Auto-generated method stub
		
		int iCount=0;
		int iSum=0;
		
		for ( iCount=from; iCount<=to; iCount++){
			iSum+=iCount;
		}
		
		
		return iSum;
	}

	static int getSumOneToTen() {
		// TODO Auto-generated method stub
		int iCount=0;
		int iSum=0;
		
		for ( iCount=1; iCount<=10; iCount++){
			iSum+=iCount;
		}
		
		
		return iSum;
	}

}
