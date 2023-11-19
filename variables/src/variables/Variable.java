package variables;

public class Variable {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(21);
		int intValue = 21;
		Integer integerValue = 21;
		
		System.out.println("before change values");
		System.out.println(e.getEmpId());
		System.out.println(intValue);
		System.out.println(integerValue);
		
		changeEmployeeId(e);
		changeIntValue(intValue);
		changeIntegerValue(integerValue);
		
		System.out.println("after change values");
		System.out.println(e.getEmpId());
		System.out.println(intValue);
		System.out.println(integerValue);
		
		System.out.println("compare two reference data types");
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setEmpId(1);
		e2.setEmpId(2);
		System.out.println(e1 == e2);
		System.out.println(e1.getEmpId() + " <-> " + e2.getEmpId());
		
		e1 = e2;
		System.out.println(e1 == e2);
		System.out.println(e1.getEmpId() + " <-> " + e2.getEmpId());
	}
	
	public static void changeEmployeeId(Employee e) {
		e.setEmpId(22);
	}
	
	public static void changeIntValue(int intValue) {
		intValue = 22;
	}
	
	public static void changeIntegerValue(Integer integerValue) {
		integerValue = 22;
	}
}
