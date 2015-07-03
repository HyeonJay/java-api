package lang;

// Story : 대소문자 구분 없애는 메소드
public class EqualsIgnoreCase {
	public static void main( String[] args ) {

		System.out.println("HELLO".equals("hello") ? "같다." : "다르다.");
		
		//리터럴 타입( String 타입 )은 equals를 CallByValue로 비교 
		// 왜냐하면 리터럴은 상수값으로 인식하기 때문
		System.out.println("HELLO".equals("HELLO") ? "같다." : "다르다.");
	
		
		System.out.println("HELLO".equalsIgnoreCase("hello") ? "같다." : "다르다.");
	}
}
