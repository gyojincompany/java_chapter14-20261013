package exceptionTest;

public class ThrowsTest {
	
	public static void divide(int a) throws Exception{		
			int result = 10/a; //by zero 에러 발생 코드
			System.out.println(result);		
	}
	

	public static void main(String[] args) {
//		int a = 10;
//		
//		if(a != 0) {
//			divide(a);
//		}
		
		try {
			divide(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
