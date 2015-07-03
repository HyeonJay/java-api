package lang;

import java.util.Arrays;

public class StringClass {
	public static void main( String[] args ) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(","); // ¹» ±âÁØÀ¸·Î ÂÉ°¶·¡? --> ½°Ç¥ ±âÁØÀ¸·Î ÂÉ°¶·¡
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i] + "\t");
		}
		System.out.println();

		System.out.println("Arrays·Î Ãâ·Â");
		//	String[] fruits2 = fruit.split(",", 2); // ¹» ±âÁØÀ¸·Î ÂÉ°¶·¡? --> ½°Ç¥ ±âÁØÀ¸·Î ÂÉ°¶·¡, 2¹øÂ°¸¸ °ø¹éÁÖ±â
		String[] fruits3 = fruit.split(",");
		System.out.println(Arrays.toString(fruit.split(",")));
	}
}
