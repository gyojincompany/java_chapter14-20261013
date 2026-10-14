package exer;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		System.out.println("당신의 나이를 입력하세요:");
		Scanner sc = new Scanner(System.in); //콘솔 입력문
		//입력된 sc 값은 무조건 String으로 저장
		
		try {
			if(Integer.parseInt(sc.nextLine()) >= 20) {
				System.out.println("당신은 성인입니다");
			} else {
				System.out.println("당신은 미성년입니다");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
