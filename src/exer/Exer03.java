package exer;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		//Scanner 클래스->키보드로 입력한 값을 프로그램으로 가져오는 클래스
		
		Scanner sc = new Scanner(System.in); //Scanner 클래스로 만든 sc 객체 생성
		
		System.out.println("당신의 이름을 입력하세요:");
		String str = sc.nextLine(); //키보드에서 입력 받은 값을 문자열로 반환해주는 메서드
		//키보드로 입력한 값을 무조건 문자열로 변환해서 반환
		
		System.out.println("당신의 이름 : "+str);	
		
		System.out.println("당신의 나이를 입력하세요:");
		int age = sc.nextInt(); //키보드에서 정수를 입력 받아 정수로 반환해주는 메서드
		System.out.println("당신의 나이 : "+age);	
		
	}

}
