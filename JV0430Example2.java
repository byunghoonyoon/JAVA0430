package project;

import java.util.Scanner;

public class JV0430Example2 {

	public static String vendingMachine(int money,int bno) {
		String[] BeverageNames = {"콜라","사이다","커피","생수"};
		int [] BeveragePrices = {1200,1000,800,500};
		if(money<BeveragePrices[bno]) {
			System.out.println("잔액이 부족합니다");
			return null;
		}
		
		System.out.printf("%s를 뽑으셨습니다.",BeverageNames[bno]);
		System.out.printf("금액은 %s원 입니다.\n", BeveragePrices[bno]);
		System.out.printf("%s원 투입하셨습니다.\n", money);
		
		int remainder = money-BeveragePrices[bno];
		System.out.printf("잔액은 %d원 입니다\n",remainder);
		return BeverageNames[bno];
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // ctrl shift o
		System.out.println("=======음료수 목록========");
		System.out.println("0 : 콜라	 (1200원)");
		System.out.println("1 : 사이다 (1000원)");
		System.out.println("2 : 커피  (800원");
		System.out.println("3 : 생수	 (500원)");
		
		System.out.println("얼마의 금액을 투입하시겠습니까 : ");
		int money = Integer.parseInt(scan.nextLine());
		
		System.out.println("어떤 음료를 선택하시겠습니까 : ");
		int bno = Integer.parseInt(scan.nextLine());
		
		// 돈, 뽑을 음료수 
		// 0=콜라(1200) 1=사이다(1000) 2=커피(800) 3=생수(500)
//		String beverage = vendingMachine(2000,3);
//		
//		if(beverage==null) {
//			System.out.println("홍길동은 음료수를 뽑지 못했습니다.");
//		}else {
//		System.out.printf("홍길동이 %s를 벌컥벌컥마십니다.", beverage);
//			}
//	}

	}
}

