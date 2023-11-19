package variables;

import java.util.Random;

public class Variable {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[5];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(0, array.length) + 1;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
