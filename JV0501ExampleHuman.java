package project;

public class JV0501ExampleHuman {

//	public static void introduce(int age, String name) {
//		System.out.printf("안녕하세요 %d살 %s입니다.\n",age,name);
//	}
	
	//클래스와 객체
	public static void introduce(Hong Hong) {
		System.out.printf("안녕하세요 %d살 %s입니다.\n",Hong.age,Hong.name);
	}
	public static void main(String[] args) {
		// 사람
		// 나이, 이름
		
		Hong h = new Hong();
		introduce(h);
		//introduce(lee.age,lee.name);
		
	}

}

	class Hong{
		static int age = 22;
		static String name = "홍길동";
	}
	class lee{
		static int age = 33;
		static String name = "이순신";
	}