package com.hanbit;

public class StudyFuctions {

	public static void main(String[] args) {
		// 1. 변수로 받은 문자열을 출력하는 함수를 작성하세요.
		printString("Hello");

		// 2. 변수로 받은 월에 따라 영문 월명을 출력하세요.
		//   ex: month = 1 -> January
		//   ex: month = 2 -> Febrarysdf
		int month = 12;
		printMonthName(month);
		PrintMonthNameArr(month);
		
	}

	 private static void PrintMonthNameArr(int month) {
		// TODO Auto-generated method stub
		 if( month > 0 && month<13){
			 String[] arrStrMonth={"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
		 
		 	System.out.println(arrStrMonth[month-1]);
		 }
		 else{
			 System.out.println("a잘못된 월 입니다.");
		 }
		 
		
	}

	private static void printMonthName(int month) {
		// TODO Auto-generated method stub
		 String result=null;
		switch ( month ){
			
			case 1:
				result="January";
				break;
			case 2:
				result="Febuary";
				break;
			case 3:
				result="March";
				break;
			case 4:
				result="April";
				break;
			case 5:
				result="May";
				break;
			case 6:
				result="June";
				break;
			case 7:
				result="July";
				break;
			case 8:
				result="August";
				break;
			case 9:
				result="September";
				break;
			case 10:
				result="October";
				break;
			case 11:
				result="November";
				break;
			case 12:
				result="December";
				break;
			default:
				result="error";
				break;
				
		}
		System.out.println(result);
		
	}

	static void printString(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
		 
		 
	}

}


