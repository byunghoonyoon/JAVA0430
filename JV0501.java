package project;

import java.util.Scanner;
import java.util.Random;
public class JV0501 {

	public static void main(String[] args) {
		
		//Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
		//입출력 예시
		//첫번째 숫자를 입력해주세요: 12
		//두번째 숫자를 입력해주세요: 33
		//12 + 33 = 45
		Scanner scan = new Scanner(System.in);
//		System.out.printf("첫번째 숫자를 입력해주세요: ");
//		int s = Integer.parseInt(scan.nextLine());
//		
//		System.out.printf("두번째 숫자를 입력해주세요: ");
//		int s2 = Integer.parseInt(scan.nextLine());
//		
//		System.out.printf("%d + %d = %d",s,s2,s+s2);
		
		 // 이름을 입력해주세요 : 홍길동
	    // 나이를 입력해주세요 : 29
	    // 출력 : 안녕하세요 29세 홍길동입니다.
		
//		System.out.println("이름을 입력해주세요 : ");
//		String name = scan.nextLine();
//		System.out.println("나이를 입력해주세요: ");
//		int s = Integer.parseInt(scan.nextLine());
//		
//		System.out.printf("안녕하세요 %d세 %s입니다.",s,name);
		
//		r를 이용해 입력값을 받아
	    // 구구단을 원하는 단이 나오게 해주세요.

	    //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

	    // 4단 출력.
//		
//		System.out.printf("원하는 단을 입력해주세요 :");
//		int s=Integer.parseInt(scan.nextLine());	
//		
//		for(int i=1; i<=9;i++) {
//			System.out.printf("%d * %d = %d\n",s,i,s*i);
			
		 Random random = new Random();
	        // random객체는 난수를 발생시켜준다.
	        // 사용법.
	        // random.nextInt(n) -> 0 ~ n 사이의 정수중 랜덤하게 하나 리턴
	        // ex)
	        // int num = random.nextInt(30);
	        // System.out.println(num); // 0 ~ 30 사이의 정수중 랜덤하게 하나 출력
		 	int num =random.nextInt(30);
	      
	        int[] lottoNums = new int[7]; // 1등 당첨 번호
	        int length = lottoNums.length;
	        // 아래와 같이 결과가 출력되도록 로또 당첨 번호 7개(보너스 번호 포함)를 선택해주세요.
	        // 1. 여기에 당첨 번호 추출 코드 작성해주세요.
	        // ** 중복된 번호는 없어야 됨.
	        
	        
		
		}
	}


