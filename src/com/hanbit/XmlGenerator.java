package com.hanbit;

import java.util.Arrays;

public class XmlGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String students = "장동건, 문재승, 한지훈"
				+",백수현,조영욱,이상윤,백미리,백재홍,김지룡,노상민, 김한슬,채성주";
		
		
		System.out.println(generateXml(students));

	}

	static String generateXml(String students) {
		// TODO Auto-generated method stub
		String[] arrResult=StringUtils03.splitNotBlankAndTrim(students,",");
		Arrays.sort(arrResult);
		String result="";
		result+="<students>\n";
		if (!StringUtils.isBlank(students)) {

			for (int i = 0; i < arrResult.length; i++) {
				result += "\t<student no=\"" + (i + 1) + "\">" + arrResult[i] + "</student>\n";

			}
		}
		result+="</students>";
		
		
		return result;
	}

}
