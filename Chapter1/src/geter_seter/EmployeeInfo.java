package geter_seter;

public class EmployeeInfo {
	public Employee [] getEmployeeInfo() {
		
		Employee [] emp = new Employee[4];
		
		emp[0]= new Employee("sachin" ,1 , 9552478147L );
		
		
		emp[1] = new Employee("Ashwini", 2, 7039748558L);
	
		
		emp[2] = new Employee("Archana", 3, 9975032670L);
		
		
		emp[3] = new Employee("Priya", 4, 9623813396L);
	
		
		return emp;
	}

}
//capcity = tolal input
//size = ocupied
//index= start 0- n-1
//length= count
