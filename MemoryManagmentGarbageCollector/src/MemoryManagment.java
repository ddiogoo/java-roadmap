import java.lang.ref.WeakReference;

public class MemoryManagment {
	public static void main(String[] args) {
		int primitiveInteger = 10;
		Person person = new Person();

		String stringLiteral1 = "diogo";
		MemoryManagment mem = new MemoryManagment();
		mem.memoryManagmentTest(person);
	}

	private void memoryManagmentTest(Person paramPerson) {
		Person person = paramPerson;
		String stringLiteral2 = "martins";
		String stringLiteral3 = new String("assis");

		WeakReference<MemoryManagment> weakMem = new WeakReference<MemoryManagment>(new MemoryManagment());
	}
}
