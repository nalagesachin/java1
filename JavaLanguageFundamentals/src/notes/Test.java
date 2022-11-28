package notes;

public class Test {
	String[] names;
	 public static void main(String[] args) {
		int[] a = new int[5];
		byte[] b = new byte [6];
		
		Test t = new Test();		
	t.names = new String[5];	
	//Or
	String[] names = new String[5];
	t.names = names;
	
	int[] arr ;    // array declataion
	arr = new int [5]; //memory allocation (objet creation)

	//Or single line arrey decleration and memory allocation
	int[] arr1 = new int[6];
}}