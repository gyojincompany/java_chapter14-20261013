package exceptionTest;

public class ExceptionTest01 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		int result = num1 / num2; //모든 수는 0으로 나눌수 없다->예외 발생
		
//		int[] nums = {10,20,30,40};
		
//		System.out.println(nums[5]);
		
		String str = "abc";
		
		int score = Integer.parseInt(str);//->에러가 날수도 있고 안날수도 있는 코드
		
		

	}

}
