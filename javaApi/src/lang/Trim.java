package lang;

// @Story : trim( ) ����
public class Trim { 
	public static void main( String[] args ) {
		String str = "         Hello          Java            World  !!               ";
		System.out.println(str.trim());
		// trim( )�� ���ͷ� ���� �յ� ������ ���ִ� ����� �Ѵ�.
		
		// �޼ҵ� ü�� ���
		//String�� �޼ҵ���� �����ؼ� ����� �� �ִµ�
		// �̰��� �޼ҵ� ü�ζ�� �Ѵ�.
		System.out.println(str.trim().replace("Java", "Jsp"));
	}
}
