package basics;



public class Arrays {
	//@002
	
	int age = 30;
	int physics = 97;
	int chemistry = 96;
	int english = 93;
	
	//arrays primitive and non primitive
	public static void main(String[] args) {
		
	
	int [] marks = new int [3];
	
	marks[0] = 91;
	marks[1] = 95;
	marks[2] = 93;
	
	System.out.println(marks);
	//[I@515f550a
	
	System.out.println(marks[0]);
	System.out.println(marks[1]);
	System.out.println(marks[2]);
	
	//length
	System.out.println(marks.length );
	
//	sort ?????????
//	System.out.println(marks[0]);
//	System.out.println(Arrayes.tostring(marks));
//    Arrays.sort(marks);
    
	System.out.println(marks[0]);
	
		
	}

}
