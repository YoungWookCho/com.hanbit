package com.hanbit;
import java.util.*;

public class FuctionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName=getFullName("Youngwook","Cho");
		System.out.println(fullName);
		String names="조영욱|김지룡";
		String[] nameArray=splitNames(names,"|");
		for (int  iCount=0; iCount<nameArray.length; iCount++){
			
			System.out.println(nameArray[iCount]);
		}
		
		//세수의 합을 함수 1개를 호출하여 구하시오.
		int x=1,y=2,z=3;
		int sum =plusTreeNumbers(x,y,z) ;
		sum=plus(x+y,z);
		sum =plus(x,y+z);
		boolean bigger= false;
		
		setBigger(bigger);
		setBigger(true);
		setBigger(1<4);
		setBigger(x>y);
		
		setBigger(isTrue());
		
		
		//세수의 합을 함수 2개를 호출하여 구하시오.
		sum=plus(plus(x,y),z);
		
		
		
	}
	static void setBigger(boolean bigger){
		
		
		
	}
	
	
	
	//1번째
	 static String getFullName( String fisrstName, String lastName ) {
		 
		return fisrstName+lastName;
	}
	
	//2번째
	static int plusTreeNumbers( int first, int second, int third) {
	
		return first+second+third;
	}
	
	//3번째
	static boolean isTrue() {
		return false;
	}
	
	//4번째
	static void printName() {
		
	}
	
	//5번쩨
	
	static void logError(String message){
		
	}
	
	//6번째
	static long caculate(int left, String operator, int right ){
		return 0;
		
	}
	
	//7번째
	
	static boolean validatePassword(String password, int maxLength, int minLength, char[] allowedCharacters){
		return false;
		
	}
	//8번째
	static String[] splitNames(String names, String separator){
		
		/*
		StringTokenizer token = new StringTokenizer(names,"|");
		String[] result=new String[token.countTokens()];
		int i = 0;
		
		while(token.hasMoreTokens()){
			result[i]=token.nextToken();
			i++;
		}
		*/
		
		String[] result=names.split("[|]");
				

		return result;
		
	}
	//9번째
	static boolean equal (Object obj) {
		return false;
		
	}
	//10번째
	static Object cloneObj(){
		
		return null;
	}
	//11번째
	static Integer decode (String number) {
		return null;
	}
	//12번째
	static int search(double[] array, int fromIndex, int toIntdex, double key){
		return 0;
		
	}
	//13번째
	
	static String[] getHashTags(){
		return null;
		
	}
	//14번째
	
	static int plus(int x, int y) {
		return 0;
	}
	//15번째
	static void println(){
		
	}
	

}
