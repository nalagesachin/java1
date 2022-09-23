package pattern_programs;

public class StarPattern09 {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("_");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			for (int l = 3; l >= i; l--) {
				System.out.print("*");
			}
			System.out.println();

		}
		//OR
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("_");
			}
			for (int k = 8; k >= (i*2); k--) {
				System.out.print("*");
			}
			System.out.println();

		}
//OR
		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >= i; j--) {
				System.out.print("_");
			}
			for (int k = 0; k <= (i*2); k++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
 //solution


//_*********
//__*******
//___*****
//____***
//_____*