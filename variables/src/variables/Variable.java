package variables;

import java.math.BigDecimal;

public class Variable {
	public static void main(String[] args) {
		char var1 = 'a';
		System.out.println(var1);
		
		char var2 = 97; 
		System.out.println(var2);
		
		byte var3 = 127;
		System.out.println(var3);
		
		byte n1 = 10;
		System.out.println(n1);
		
		short n2 = n1;
		System.out.println(n2);
		
		int n3 = n2;
		System.out.println(n3);
		
		long n4 = n3;
		System.out.println(n4);
		
		int integerVar = 128;
		System.out.println(integerVar);
		
		byte byteVar = (byte)integerVar;
		System.out.println(byteVar);
		
		float f1 = .7f;
		System.out.println((double)f1);
		
		BigDecimal bd = new BigDecimal(.7f);
		System.out.println(bd.floatValue());
	}
}
