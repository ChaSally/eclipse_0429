package hellowworld_0429;

public class hello2 {

	public static void main(String[] args) {
		
		// 정수(데이터 타입) 변수 x 선언
		int x;  //메모리에 4byte 공간이 하나 생성--이름은 x
		x = 10; // 값 저장 =는 대입연산자, x의 초깃값은 10

		int y = 10;
		int z;
		
		// 한번에 3개의 정수변수를 선언, 이미 선언된 변수를 다시 선언하지 못함
		x = 100;
		int a = 100; // 정수변수 a 선언과 동시에 100으로 초기화
		
		z = a + y;
		
		System.out.println("저의 수학점수는 " + a + "점입니다!");
		
		if (a > 100) {
			System.out.println("저의 수학점수는 " + a + "점입니다!");
			System.out.println("저의 수학점수는 " + a + "점입니다!");
			System.out.println("저의 수학점수는 " + a + "점입니다!");
		} else {
			System.out.println("저의 수학점수는 " + a + "점입니다!");
			System.out.println("저의 수학점수는 " + a + "점입니다!");
			System.out.println("저의 수학점수는 " + a + "점입니다!");
		}
		int b;
		
		char c = 'A'; // 한 글자 char는 '', 문자열은 String(첫글자 대문자)으로 ""
		String f = "Korea"; // String은 class ex, String str = "abc"; 싱수

		double e1 = 10.1;
		float e2 = 3.14f; // 4byte, f붙여야
		long k = 10L; //integer와 차별화 대문자 L	
		boolean aaa = true; // true/false는 소문자로 시작하는 예약어
		
		System.out.println("\"큰따옴표\"를 기억합시다");
		
		
	}
	
	int a = 10;

}
