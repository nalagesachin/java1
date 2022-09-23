package pattern_programs;

public class StarPattern11 {
	public static void main(String [] args ) {
		for (int i=0; i<=4; i++) {
			for (int j=13; j>=i; j--) {
				System.out.print("-");
			}
			for (int k=0; k<=i; k++){
			 System.out.print(" *");
			 }
			System.out.println();
			}
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("-");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print(" *");
			}
			for (int j2 = 0; j2 <= 5; j2++) {
				System.out.print("-");
			}
			for (int j1 = 0; j1 <= i; j1++) {
				System.out.print("--");
			}
			for (int k1 = 4; k1 >= i; k1--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("-");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}
			for (int j1 = 7; j1 >= i; j1--) {
				System.out.print("--");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}

			System.out.println();
		}
		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("-");
			}
			for (int j1 = 0; j1 <= 8; j1++) {
				System.out.print("-");
			}

			for (int k = 4; k >= i; k--) {
				System.out.print(" *");
			}
			System.out.println();
		}

		}}