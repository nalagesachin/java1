package programsInNotes;

public class ControllerForEmployee {
	public static void main(String[] args) {
		//foe static variable & method use class name
		Employee.officeName ="Infosys limited";
		Employee.s1();
		Employee.s2();
		
		Employee e= new Employee();
		e.name= "abc";
		e.empId=23;
		e.cellphone=6565621554L;
		e.m1();
		e.m2();
		
	
	}
	
	

}
