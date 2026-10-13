package exceptionTest;

public class TryCatchTest01 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10; //외부에서 받아오는 값이라고 가정
				
		
		
		//예외처리문의 기본 문법
		
		try {
			int result = num1 / num2; //->num2가 0이면?->에러 발생!!
			System.out.println(result);
			int[] nums = {10,20,30,40};			
			System.out.println(nums[3]);
		} catch (Exception e) {
			System.out.println("에러가 발생했습니다. 다시 확인하세요");
			e.printStackTrace(); //해당 에러메시지 출력
		} finally { //옵션 생략 가능
			//->try블럭안의 문장 에러 발생 여부와 상관없이 무조건 실행됨
			System.out.println("finally로 감싸져 있는 블록은 무조건 실행됨!");
			//마무리 작업, 정리 작업->DB close 작업
		}
		
		System.out.println("프로그램이 계속 실행됩니다");
	}

}
