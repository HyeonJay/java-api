package lang;

// @Story : equals( ) 활용 예제
public class PersonMain {
	public static void main( String[] args ) {
		Person p1 = new Person("800101-1234567");
		Person p2 = new Person("800101-1234567");

		String result = ""; // 지역변수 초기화
		result = (p1 == p2) ? "동일인" : "다른사람";

		//삼항연산자( if - else 대신 간단하게 표현할 때 사용 )
		//(컨디션) ? true일 경우 : false 일 경우
		System.out.println("p1 == p2일 경우 결과 " + result);
		//결과가 다른 사람으로 출력되는 것은 실제 값 비교가 아니라 
		// == 이 참조 주소값 비교이기 때문이다.
		result = (p1.equals(p2)) ? "동일인" : "다른사람";
		// 주소값 비교가 아닌 실제값 비교 결과를 리턴
		// 주소값 : call by reference --> 자바에서 간접 주소로 메모리 접근
		// 실제값 : call by value  --> C언어에서 직접 메모리를 점유
		System.out.println("p1 == p2일 경우 결과 " + result);
		
	}
}
