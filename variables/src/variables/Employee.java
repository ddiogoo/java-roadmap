package variables;

public class Employee implements Person {
	int empId;
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int paramEmpId) {
		this.empId = paramEmpId;
	}

	@Override
	public String profession() {
		return "software engineer";
	}
}
