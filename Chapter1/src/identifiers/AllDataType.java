package identifiers;

public class AllDataType {

	byte b = 1;
	byte b1 = 1154;// Type mismatch: cannot convert from int to byte
	short s = 20;
	short s1 = 56520; // Type mismatch: cannot convert from int to short
	int i = 300;
	int i1 = 2551545552;// Type mismatch: cannot convert from long to int
	long l = 100000021021L;

	float f = 1.01F;
	float f1 = 92.0; // Type mismatch: cannot convert from double to float
	double d = 1210.01545D;
	double d = "1210.01545"; // Type mismatch: cannot convert from String to double

	char c = 'a';
	char c1 = a;// a cannot be resolved to a variable
	char c2 = "a";//		- Type mismatch: cannot convert from String to char	

	char c3 = 'a';

	boolean bb = true;

}
