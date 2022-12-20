package videos;
//4java-data-type-user define

public class controller {
	
	public static void main(String[] args) {
		Student s= new Student();
		s.name =  "sachin";
		s.rollNumber = 10;
		s.div = 'A';
		s.schoolName = "skdv";
		
		System.out.println(s); //videos.Student@626b2d4a
		System.out.println(s.rollNumber); //10
		System.out.println(s.div); //a
		
		
		Student s1 = new Student();
		s1.name =  "sachin";
		s1.rollNumber =11;
		s1.div = 'A';
		s1.schoolName = "skdv";
		
		
		
	}

}
