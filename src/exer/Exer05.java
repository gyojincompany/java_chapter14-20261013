package exer;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		//입력 받은 숫자가 짝수인지 홀수인지 판별하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요:");
		String str = sc.nextLine(); //입력받은 값을 문자열로 반환
		
		try {
			//문자열인 str을 정수로 변환
			int num = Integer.parseInt(str); //문자열->정수로 변환 후에 저장
			
			if(num % 2 == 0) { //짝수
				System.out.println("입력하신 숫자는 짝수입니다!");
			} else { //홀수
				System.out.println("입력하신 숫자는 홀수입니다!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("정수만 입력가능합니다.");
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		
		System.out.println("프로그램 정상종료");
	}

}
