import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int money = 0;
		
		if (num1==num2 && num2==num3) { // 같은 눈이 3개 일 때
			money = 10000+num1*1000;
		} else if (num1==num2 || num2==num3 || num3==num1) { // 같은 눈이 2개 일 때
			if (num1==num2) {
				money = 1000+num1*100;
			} else if (num2==num3) {
				money = 1000+num2*100;
			} else if (num3==num1) {
				money = 1000+num3*100;
			}
		} else { // 모두 다른 눈일 때
			if (num1>num2 && num1>num3) {
				money = num1*100;
			} else if (num2>num1 && num2>num3) {
				money = num2*100;
			} else {
				money = num3*100;
			}
		}
		
		System.out.println(money);
	}
}
