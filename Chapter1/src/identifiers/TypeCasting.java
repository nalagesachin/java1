package identifiers;

public class TypeCasting {
	public static void main(String[] args) {
		byte b =10;
		short s= b;   char c='a';
		int i= s;     int ii= c;	
		long l= i;    long ll= i;
		float f= l;   float ff= ll;
		double d=f;   double dd = ff;
		// up casting
		
		double d1 =415.125D;
		float f1 = d1;
		long l1 = f1 ;
		int i1 = l1;
		short s1= i1; char c1=i1;
		byte b1 = s1;
		//down casting
		System.out.println(ll); 
		
		char ccc = 'b';
		byte bbb = ccc; //Type mismatch: cannot convert from char to byte
		short sss = ccc; //Type mismatch: cannot convert from char to short
		
	}

}
