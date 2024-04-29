package hellowworld_0429;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 200;
		
		System.out.println(a * b);
		System.out.println(a / b); // 정수 대 정수 언산은 정수로 답이 나옴
		
		double c = 3.5;
		double d = 7.0;
		
		System.out.println(c + d);
		System.out.println(d / c); // 실수로 나옴
		
		int e = 10;
		double f = 2.5;
		
		System.out.println(e + f); // 정수 대 실수 연산은 실수
		System.out.println(e / f); // 답에 소수점이 없어도 .0 실수로
		
		int r1;
		r1 = (int) (e/f); // Type mismatch, 저장하려는 변수의 datatype 고려
		System.out.println(r1);
		
		String str1 =  "3" + 10;
		System.out.println(str1); // 양쪽대 문자열로 반환
		
		// 문자열을 기본 타입으로 변환 : wrapper Class
		String numStr1 = "10";
		//int mumInt1 = (int)numStr1; // 자바에서는 불가
		int numInt1 = Integer.parseInt(numStr1); // 문자열을 정수로 변환 ##
		
		String numStr2 = "3.14";
		double numDouble1 = Double.parseDouble(numStr2);
		
		String numStr3 = "true";
		boolean numLogic = Boolean.parseBoolean(numStr3);
		
		// 기본타입을 문자열로 변환
		int num1 = 100;
		//String str2 = (string)100; // 바로 문자로 변환 불가
		String str2 = String.valueOf(num1); // 정수 100을 문자열로 변환 ##
		
		System.out.println(str2);
		
		
				

	}

}
