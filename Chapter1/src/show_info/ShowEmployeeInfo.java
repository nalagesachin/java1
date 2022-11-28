package show_info;

import geter_seter.Employee;
import geter_seter.EmployeeInfo;

public class ShowEmployeeInfo {
	public static void main(String[] args) {
		EmployeeInfo obj = new EmployeeInfo();
		Employee [] employeeArray =obj.getEmployeeInfo();
		
		for (int i= 0; i<employeeArray.length ; i++) {
			System.out.println(employeeArray[i].getEmpName());
			System.out.println(employeeArray[i].getEmpId());
			System.out.println(employeeArray[i].getMobileNo());
			System.out.println("======================");
		}
	}

}
