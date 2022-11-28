package basics;

public class Main {
	
	public static void main(String[] args) {
		
		//@001
		//non primitive types-variable size not defined
		String nameFirst = "sachin";
		String nameLast = "nalage";
		System.out.println(nameFirst);
		System.out.println("hello world");
		System.out.println("ghfgf");
		
		//length
		System.out.println(nameFirst.length());
		
		//concatinatin
		String nameFull = nameFirst + nameLast;
				System.out.println(nameFull);
				
		//charAt
		System.out.println(nameFirst.charAt(0));
		
		//replace
		String name2 =nameFirst.replace('s','S'); 
		System.out.println(name2);
		
		//sub string
		System.out.println(nameFull.substring(0,12));
	
				
	}

}
