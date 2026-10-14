package exer;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		System.out.println("정수를 입력하세요:");
		Scanner sc = new Scanner(System.in); //콘솔 입력문
		
		try {
			int number = Integer.parseInt(sc.nextLine());//에러가 날 가능성이 있는 문장
			
			if((number >= 0) && (number <= 100)) {
				System.out.println("정상적인 숫자입니다.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("점수 확인이 완료되었습니다.");
		}
		
	}

}
