package lang;

import java.util.Arrays;

public class StringClass {
	public static void main( String[] args ) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(","); // �� �������� �ɰ���? --> ��ǥ �������� �ɰ���
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i] + "\t");
		}
		System.out.println();

		System.out.println("Arrays�� ���");
		//	String[] fruits2 = fruit.split(",", 2); // �� �������� �ɰ���? --> ��ǥ �������� �ɰ���, 2��°�� �����ֱ�
		String[] fruits3 = fruit.split(",");
		System.out.println(Arrays.toString(fruit.split(",")));
	}
}
