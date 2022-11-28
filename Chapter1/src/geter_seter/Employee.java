package geter_seter;

public class Employee {
	private String empName;
	private int empId;
	private long mobileNo;
	public Employee(String empName, int empId, long mobileNo) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.mobileNo = mobileNo;
	}
 public Employee() {}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
 
	

}
