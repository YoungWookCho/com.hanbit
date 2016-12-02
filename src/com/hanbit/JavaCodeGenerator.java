package com.hanbit;

public class JavaCodeGenerator {

	public static void main(String[] args) {

		/*
		 * 다음과 같이 소스코드를 생성하여 출력하시오.
		 * 
		 * public class JavaCodeGenerator {
		 * 
		 * public static void main(String[] args) {
		 * System.out.println("Hello, Java"); }
		 *
		 * static void print() {
		 * 
		 * }
		 *
		 * }
		 */
		System.out.println(generateSourceCode("Hello, Java",  "print","taskNumber" ));
		
		String template ="System.out.println([var]);";
		/*
		 * 다음과 같이 출력하시오.
		 * 
		 * System.out.println("Hello, World");
		 */
		
		
		System.out.println(generatePrintln(template,"Hello, World"));
		System.out.println(generatePrintln(template,"42.43"));
		
		
	}

	static String generatePrintln(String template, String string) {
		// TODO Auto-generated method stub
		if (NumberUtils.isNumber(string)){
			return StringUtils00.replace(template, "[var]", string);
			
		}
		
		return StringUtils00.replace(template, "[var]", "\""+string+"\"");
	}

	/**
	 * @param string
	 * @param fuctionName
	 * @return
	 */
	static String generateSourceCode(String string, String... fuctionName) {
		// TODO Auto-generated method stub

		String result = "public class JavaCodeGenerator " + "{\n\n\tpublic static void main(String[] args) "
				+ "{\n\t\tSystem.out.println(\"" + string + ");\n\t}";

		for (int i = 0; i < fuctionName.length; i++) {
			result += "\n\n\tstatic void ";
			result+= fuctionName[i] + "() {\n\n\t}";
			
		}
		result += "\n}";
		return result;

	}
}
