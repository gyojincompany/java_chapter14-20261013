package exer;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		//두 숫자를 입력받아 두 수의 합을 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		try {
			System.out.println("첫 번째 숫자를 입력하세요:");
			num1 = sc.nextInt();
			System.out.println("두 번째 숫자를 입력하세요:");
			num2 = sc.nextInt();
			System.out.println("당신이 입력한 두 숫자의 합 : " + (num1+num2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("정수 숫자만 입력 가능합니다. 다시 확인하세요.");
			e.printStackTrace();
		}
		
		
		sc.close(); //sc 객체 닫기->Scanner 사용 종료
		
		int a;
		int b = 1;
		
		if (b > 10) {
			a = 10;		
			System.out.println(a);
		}
		
		

	}

}
