package variables;

import java.util.Random;

public class Variable {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[5];
		int[] results = {5, 2, 1, 3, 4};
		boolean findResult = false;
		int number = 0;
		
		while(true) {
			for(int i = 0; i < array.length; i++) {
				array[i] = random.nextInt(0, array.length) + 1;
			}
			
			for(int i = 0; i < array.length; i++) {
				if(array[i] == results[i]) {
					findResult = true;
				} else {
					findResult = false;
					break;
				}
			}
			
			if(findResult) break;
			number++;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("ARRAY EQUIVALENTE ENCONTRADO NA TENTATIVA " + number + "º.");
	}
}
