package video7;

public class Controller {

	public static void main(String[] args) {
		School s= new School();
	    s.schoolName= "skdv";
		
	    
		Address a= new Address();
		a.city = "pune";
		 a.pin = 415789;
		 s.adr=a;
		 
		 
		Address a1 = new Address();
		a1.city = "goa";
		a1.pin = 245656;
		
		Headmaster h= new Headmaster();
		h.name = "abcd";
		h.adr = a1;
		
		 System.out.println(s);
		 System.out.println(a);
		 System.out.println(a1);
		 System.out.println(h);
		 System.out.println(">>>>>above fully qulified name and @hexadecimal value<<<<<<<<<<");
		System.out.println(s.schoolName);
		
	}

}
