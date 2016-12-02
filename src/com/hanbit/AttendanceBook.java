package com.hanbit;

import java.util.Arrays;

public class AttendanceBook {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String students = "장동건, 문재승, 한지훈"
		+",백수현,조영욱,이상윤,백미리,백재홍,김지룡,노상민, 김한슬,채성주";
		/*
		 * 다음처럼 출력하시오.
		 * 1. 정동건
		 * 2. 문재승
		 * ...
		 * 12. 채성주
		 */
		System.out.println(createAttendanceBook(students));
		System.out.println(getStudentNumber(students,"백미리"));

	}


	static int getStudentNumber(String students, String name) {
		// TODO Auto-generated method stub
		if(StringUtils.isBlank(students)|| StringUtils.isBlank(name)){
			return -1;
		}
		
		String[] arrResult=StringUtils03.splitNotBlankAndTrim(students,",");
		Arrays.sort(arrResult);
		return Arrays.binarySearch(arrResult, name)+1;
		
	}
	
	

	static String createAttendanceBook(String students) {
		// TODO Auto-generated method stub
		if (students==null){
			return "";
		}
		// 정렬
		
		
		String[] arrResult=StringUtils03.splitNotBlankAndTrim(students,",");
		Arrays.sort(arrResult);
		int pos=2;
		int size= (String.valueOf(arrResult.length)).length()+pos;
		String result="";
		
		
		for (int i=0; i<arrResult.length; i++){
			String student=arrResult[i];
			
		
			
			result=result+StringUtils01.leftPad((i+1)+". ",size,'0')+student+"\n";
		
		}

		return result;
	}

}
