package exceptionTest;

public class TryCatchTest02 {

	public static void main(String[] args) {
		String name = null;
		
		//System.out.println(name.length());
		
		
		if(name != null) {
			System.out.println(name.length());
		} else {
			System.out.println("name값이 비어있습니다.");
		}
		
		try {
			System.out.println(name.length());
		} catch (Exception e) {
			System.out.println("name값이 비어있습니다.");
		}
	}

}
