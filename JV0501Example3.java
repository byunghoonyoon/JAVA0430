package project;

import java.util.Scanner;
public class JV0501Example3 {

	static int save = 0;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String data= null;
		for(int i = 0; ; i++) {
			System.out.print("기능을 선택해주세요 (1. 값 저장, 2. 값 조회 0. 시스템 종료) :");
			int menu = Integer.parseInt(scan.nextLine());
			
			if(menu == 1) {
				System.out.print("저장할 값을 입력해주세요 : ");
				int save1 = Integer.parseInt(scan.nextLine());
				save+=save1;
			} else if(menu == 2) {
				System.out.printf("당신이 저장한 값: %s\n", save);
				
			} else if(menu == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
			else {
				System.out.println("잘못된 명령입니다.");
				
			}
		}		

	}

}
