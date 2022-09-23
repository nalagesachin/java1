package pattern_programs;

public class StarPattern08 {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("_");
			}
			for (int k =0; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();

		}
		//OR
		
		for (int i = 0; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("_");
			}
			for (int k =0; k <=( i*2); k++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}
}


//____*
//___***
//__*****
//_*******
//*********