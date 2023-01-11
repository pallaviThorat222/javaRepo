package itsolutions;

public class demo {
	private Integer empId;
	private String empName;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "demo [empId=" + empId + ", empName=" + empName + "]";
	}
	public demo() {
		// TODO Auto-generated constructor stub
	}
	public demo(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
private String empAddress;
private Double empSalay;
	

}
