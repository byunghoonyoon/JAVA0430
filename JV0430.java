package project;

public class JV0430 {
	
	public static int func1() {
		return 10;
	}
	public static int func2(int c) {
		return c;
	}
	public static int func3(int a) {
		return a*a;
	}
	public static int func4(int i,int j) {
		return i+j;
	}
	public static int test1(int num ) {
		return num*num;
	}
	public static int plus(int i,int j) {
		return i+j;
	}
	public static int minus(int i,int j) {
		return i-j;
	}
	public static int multiple(int i,int j) {
		return i*j;
	}
	public static int divide(int i,int j) {
		return i/j;
	}
	public static int square(int i) {
		return i*i;
	}
	public static void func5() {
		for(int i=1;i<=9;i++) {
			if(i==5) {
				return;
			}
			System.out.println(i);
		}
	}
	public static int func6() {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				return 5;
			}
			System.out.println(i);
		}
	return 0;
	}
	public static boolean isNegative(int no) {
		if(no<0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isEven(int num) {
    	if(num%2==0) {
    		return true;
    	}else {
    		return false;
    	}
    }
	public static void printEven(int n) {
		for(int i=1;i<=n;i++) {
			if(isEven(i)== true) {
				System.out.printf("%d ",i);
			}
		}System.out.println();
	}
	public static void main(String[] args) {
	
		int a = func1();
	    System.out.println(a);
	    // 출력 : 10
	    int b = func1();
	    System.out.println(b);
	    // 출력 : 10

	    int c = func2(22);
	    System.out.println(c);
	    // 출력 : 22
	    
	    int d = func2(55);
	    System.out.println(d);
	    // 출력 : 55

	    int e = func3(10);
	    System.out.println(e);
	    // 출력 : 100
	    int f = func3(5);
	    System.out.println(f);
	    // 출력 : 25

	    int g = func4(10, 30);
	    System.out.println(g);
	    // 출력 : 40

	    int h = func4(20, 50);
	    System.out.println(h);
	    // 출력 : 70
	    
	    int rst1 = plus(10, 20);
	    System.out.println(rst1);  // 출력 : 30

	    int rst2 = minus(10, 20);
	    System.out.println(rst2); // 출력 : -10

	    int rst3 = multiple(5, 4);
	    System.out.println(rst3); // 출력 : 20

	    int rst4 = divide(10, 3);
	    System.out.println(rst4); // 출력 : 3

	    int rst5 = square(5);
	    System.out.println(rst5); // 출력 : 25
	    
//	    int i=10;
//	    double v = 10.1;
//	    String s = "Hello";
//	    boolean x = true;
	    
	    // 0은 양수로 보겠습니다.
	    // no 값을 바꿔가면서 테스트해보세요.
	    int no = 1;

	    if(isNegative(no)) {

	      System.out.println("음수입니다.");

	    } else {

	      System.out.println("양수입니다.");
	    }
	    
	    printEven(10); // 출력: 2 4 6 8 10
	    printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
	    printEven(5); // 출력: 2 4 
	    
	}
}

