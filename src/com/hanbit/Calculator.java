package com.hanbit;
import java.util.*;

public class Calculator {

	//sum(더하기), subtract(빼기), multiply(곱하기)
	//divide(나누기), remain
	//각 함수의 매개 변수는 정수 2개 씩 반화형은 정수
	
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		
		System.out.print("hell:");
		int x=scan.nextInt();
		System.out.print("hell1:");
		int y=scan.nextInt();
		String operator=scan1.nextLine();
		
		System.out.println(caculate(x,y,operator));
		
		*/
		System.out.println(caculate(2,3,"+"));
		System.out.println(calculateMore(3,4,"*","+","-"));
		System.out.println(calculateMore(3,4,new String[]{"*","+","-"}));
		
	}
	
	
	static int calculateMore(int x, int y, String[] operator) {
		
		
		
		int result1 = caculate(x,y,operator[0]);
		int result2 = caculate(x,y,operator[2]);
		
		return caculate(result1,result2,operator[1]);
	}
	
	
	static int calculateMore(int x, int y, String operater1, String operater2, String operater3) {
		
		int result1 = caculate(x,y,operater1);
		int result2 = caculate(x,y,operater3);
		
		return caculate(result1,result2,operater2);
	}
	
	
	
	
	
	
	static int caculate(int x, int y, String operator){
		
		if ( "+".equals( operator ) ) {
			return sum(x,y);
		}
		else if ( "-".equals( operator )) {
			return substract(x,y);
		}
		else if ( "*".equals( operator )) {
			return multiply(x,y);
		}
		else if ( "/".equals( operator )) {
			return divide(x,y);
		}
		else if ( "%".equals( operator )) {
			return remain(x,y);
		}
		else {
			return 0;
		}
	}
	
	
	static int sum(int x, int y){
		
		return x+y;
	}
	
	
	
	static int substract(int x, int y){
		return x-y;
	}
	
	
	
	static int multiply(int x, int y){
		return x*y;
	}
	
	
	static int divide(int x, int y){
		if ( y != 0){
			return x/y;
		}
		else {
			return 0;
		}
	}
	
	static int remain(int x, int y){
		return x%y;
	}
	
	
	
	
	
	

}
