package com.hanbit;


	public class ArrayExercise {
		

		public static void main(String[] args) {
			
			// 1. 1월부터 12월까지 영문 월명을 담고있는
			//    배열을 만들어 반환하세요.
			//    단, {"January", ... "December"} 문법 제외
			String[] monthNames = createMonthNameArray();
			printArray(monthNames);
			
			// 2. 월명 배열의 각 글자 수를 배열로 만들어 반환하세요.
			//  hint: int lengthOfString = "March".length();
			int[] monthNamesLength = countMonthNamesLength(monthNames);
			printArray(monthNamesLength);
			
			// 3. 월명이 5자 이하인 월명을 배열로 만들어 반환하세요.
			String[] shortMonthNames = getShortMonthNames(monthNames);
			printArray(shortMonthNames);
			
			
			// 4. 월명이 5자 이하이면 월명을 배열에 넣고
			//    6자 이상이면 "Long" 문자열을 넣어서 배열을 반환하세요.
			shortMonthNames = getShortMonthNamesOrLong(monthNames);
			printArray(shortMonthNames);
			
		
			
			
		}
		
		
		
		
		
		
		 static String[] getShortMonthNamesOrLong(String[] monthNames) {
			// TODO Auto-generated method stub
			 String[] arrResult= new String[12];
			
			 for (int iCount=0; iCount<monthNames.length; iCount++){
				 
				 if ( monthNames[iCount].length()>5){
					 arrResult[iCount]="Long";
					 
				 }
				 else {
					 arrResult[iCount]=monthNames[iCount];
					 
				 }
				 
				 
			 }
			 
			 
			 
			 return arrResult;
			 
			 

		}






		static String[] getShortMonthNames(String[] monthNames) {
			// TODO Auto-generated method stub
			 
			 			 
			 
			 
			 
			 int iCount=0;
			 
			 for (int j=0; j<12; j++){
				 
				 if ( monthNames[j].length()<=5 ){
					 iCount++;
				 }
			 }
			 
			 String[] monthNamesUnder5= new String[iCount];
			 iCount=0;
			 
			 for (int j=0; j<monthNames.length; j++){
				 
				 if ( monthNames[j].length()<=5 ){
					 monthNamesUnder5[iCount]=monthNames[j];
					 iCount++;
				 }
			 }
			 
			 
			return monthNamesUnder5;
		}






		static int[] countMonthNamesLength(String[] monthNames) {
			// TODO Auto-generated method stub
			 int []arrMonthLength= new int[monthNames.length];
			 
			 for (int iCount=0; iCount<monthNames.length; iCount++){
				 
				 arrMonthLength[iCount]= monthNames[iCount].length();
				 
			 }
			 
			 
			 
			return arrMonthLength;
		}






		static String[] createMonthNameArray() {
			 String [] arrMonth= new String[12];
			 
			 arrMonth[0]="January";
			 arrMonth[1]="Febuary";
			 arrMonth[2]="March";
			 arrMonth[3]="April";
			 arrMonth[4]="May";
			 arrMonth[5]="June";
			 arrMonth[6]="July";
			 arrMonth[7]="August";
			 arrMonth[8]="September";
			 arrMonth[9]="October";
			 arrMonth[10]="November";
			 arrMonth[11]="December";
			 
			 
			 
			
			return arrMonth;
		}
		
		static void printArray(int[] array) {
			System.out.print("[");
			for (int i=0;i<array.length;i++) {
				if (i > 0) {
					System.out.print(", ");
				}
				
				System.out.print(array[i]);
			}
			System.out.println("]");
		}
		 
		 
		 

		static void printArray(String[] array) {
			System.out.print("[");
			for (int i=0;i<array.length;i++) {
				if (i > 0) {
					System.out.print(", ");
				}
				
				System.out.print(array[i]);
			}
			System.out.println("]");
		}
	}
