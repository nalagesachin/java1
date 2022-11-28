package pattern_programs;

public class StarPattern15 {
	public static void main(String[] args) {
		for (int i = 1; i<=5; i++) {
			for (int j = 1; j <=5; j++) {
				if (i==j || i+j==7-1) {
					System.out.print("*");
					
				} else {

				
				System.out.print("_");
			}}
		System.out.println();}
	}

}
//*___*
//_*_*_
//__*__
//_*_*_
//*___*

