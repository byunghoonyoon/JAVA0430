package project;

public class JV0501Example2 {
	
	static int remainder = 0;
	public static int deposit(int money) {
		remainder += money;
		System.out.printf("%d원을 예금 하셨습니다.\n",money);
		System.out.printf("잔액은 %d원입니다.\n",remainder);
		return money;
	}
	
	public static int withdraw(int money) {
		System.out.printf("%d원을 출금 하셨습니다.\n",money);
		remainder -= money;
		System.out.printf("잔액은 %d원입니다.\n",remainder);
		return money;
	}
	public static void main(String[] args) {
		// 지역변수,변수의 생명주기(스코프)
		// 다 사용한 변수를 제거하는 규칙 필요.
		// 변수를 지역{}안에서 만들면 지역이 끝날때 변수는 사라짐.
		
		// 모든 함수가 같이 사용 가능한함수 -> 전역변수.스태틱변수 클래스변수. static int num = 20 main위에작성.
		
		deposit(1000); //예금
		withdraw(400); //출금
		deposit(2000);
		deposit(3000);
		withdraw(1800);

	}

}
