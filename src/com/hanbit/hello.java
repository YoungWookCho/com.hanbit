package com.hanbit;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=2015;
		int days=7;
		// 해당 년의 총 날짜 수를 출력하세요.
		System.out.println(getDaysOfYear(year));
		
		// 3개 정수 값을 받아 앞의 두 값을 더하고 세번째 값을 빼는 함수를 작성하세요.
		System.out.println(plusAndMinus(3, 5, 2));
		
		// 3개 정수 값을 받아 앞의 두 값을 더하고 세번째 값을 곱하는 함수를 작성하세요.
		System.out.println(plusAndMultiply(3, 5, 2));
		
		// 3개 정수 값을 받아 앞의 두 값을 더하고 그합이
		//짝수면 세번째 값을 곱하고
		//홀수면 세번째 값을 빼는 
		//함수를 작성하세요.
				System.out.println(plusAndMultiplyOrMinus(4, 5, 2));
		

	}
	
	static int plusAndMultiplyOrMinus(int iNum1, int iNum2, int iNum3) {
		
		int iSum = plus(iNum1, iNum2);
		// 만약에 iSum의 값을 나눈 나머지를 1로 한다면 음수로 나누면
		//문제가 생김 나머지가 1이 될수도 있기 때문에
		if ( iSum % 2 == 0 ){//짝수
			return multiply(iSum, iNum3);
		}
		else {//홀수
			return minus(iSum, iNum3);
		}

	}
	
	static int plusAndMultiply(int iNum1, int iNum2, int iNum3){
		
		return multiply(plus(iNum1, iNum2), iNum3);
		
	}
	
	static int multiply(int iNum1, int iNum2){
		
		return iNum1 * iNum2;
	}
	
	
	
	static int plusAndMinus(int iNum1, int iNum2, int iNum3){
		//앞의 두숫자를 더하고 세번째 숫자를 뺌
		return minus(plus(iNum1, iNum2), iNum3);
		
	}
	
	static int plus(int iNum1, int iNum2){
		
		return iNum1 + iNum2;
	}
	
	static int minus(int iNum1, int iNum2){
		return iNum1 - iNum2;
	}
	
	static int getDaysOfYear(int year){
		int days=0;
		
		
		if ( year%4 == 0 ){
			days=366;
			return days;
		}
		else if ( year%4 != 0 ){
			days=365;
			return days;
		}
		else{
			return days;
		}
		

	}


}
