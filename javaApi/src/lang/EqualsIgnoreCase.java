package lang;

// Story : ��ҹ��� ���� ���ִ� �޼ҵ�
public class EqualsIgnoreCase {
	public static void main( String[] args ) {

		System.out.println("HELLO".equals("hello") ? "����." : "�ٸ���.");
		
		//���ͷ� Ÿ��( String Ÿ�� )�� equals�� CallByValue�� �� 
		// �ֳ��ϸ� ���ͷ��� ��������� �ν��ϱ� ����
		System.out.println("HELLO".equals("HELLO") ? "����." : "�ٸ���.");
	
		
		System.out.println("HELLO".equalsIgnoreCase("hello") ? "����." : "�ٸ���.");
	}
}
