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
