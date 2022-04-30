package project;

import java.util.Scanner;
// Ctrl Shift o 

public class JV0430Example3 {

	
	public static void main(String[] args) {
		
		//입력 키보드 파일 마우스
		//처리 프로그램
		//출력 (System.out.println)
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.printf("첫번째 데이터를 입력해주세요 : "); // UI. User Interface
//		String s = scan.nextLine(); // 입력 데이터를 읽어옴 scanf.
//		
//		System.out.printf("두번째 데이터를 입력해주세요 : ");
//		String s2 = scan.nextLine();
//		
//		System.out.printf("당신이 처음 입력한 값은 : %s\n당신이 두번째 입력한 값은 : %s ",s,s2);
		
		System.out.printf("첫번째 데이터를 입력해주세요 : "); 
		int s = Integer.parseInt(scan.nextLine()); //Integer.parseInt(); 
		
		System.out.printf("두번째 데이터를 입력해주세요 : ");
		int s2 = Integer.parseInt(scan.nextLine());
		
		System.out.printf("당신이 처음 입력한 값은 : %s\n당신이 두번째 입력한 값은 : %s \n",s,s2);
		System.out.printf("%d+%d=%d\n",s,s2,s+s2);
	}

}
