package programsInNotes;

public class Employee {
	
	int empId;
	String name;
	long cellphone;
	static String officeName;
	
	void m1() {
		System.out.println("I am m1 method");	
	}
     static void s1() {
    	 System.out.println("I am static method");
    	 
    	 
     }
     void m2() {
    	 System.out.println(empId);
    	 System.out.println(name);
    	 System.out.println(cellphone);
    	 m1();
    	 
    	 System.out.println(officeName);//Employee.officeName
         s1();
     }
     static void s2() {
    	 System.out.println(officeName );//Employee.officeName
    	 s1();
//    	 System.out.println(empId);
//    	 System.out.println(name);
//    	 System.out.println(cellphone);
    	 
    	 //solution
    	 Employee e = new Employee();
    	 System.out.println(e.empId);
    	 System.out.println(e.name);
    	 System.out.println(e.cellphone);
    	 e.m1();
     }
}
