package exceptionTest;

public class ThrowTest {
	
	public void checkAge(int age) {
		
		if(age < 0) { //나이는 음수가 없다->age값으로 음수 입력시 예외 발생
			throw new IllegalArgumentException();
		}
		
		System.out.println("정상적인 나이입니다.");
	}
	
}
