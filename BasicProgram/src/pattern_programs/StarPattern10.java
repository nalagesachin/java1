package pattern_programs;

public class StarPattern10 {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int j = 13; j >= i; j--) {
				System.out.print("-");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("-");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			for (int l = 3; l >= i; l--) {
				System.out.print("*");
			}
			for (int m = 0; m <= 6; m++) {
				System.out.print("-");
			}
//			for (int m1 = 1; m1 <= i; m1++) {
//				System.out.print("-");
//			}
			for (int n = 0; n <= i; n++) {
				System.out.print("--");
			}
			for (int o = 4; o >= i; o--) {
				System.out.print("*");
			}
			for (int p = 3; p >= i; p--) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("-");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}
			for (int m = 0; m <= 7; m++) {
				System.out.print("-");
			}
			for (int m1 = 3; m1 >= i; m1--) {
				System.out.print("-");
			}
			for (int n = 4; n >= i; n--) {
				System.out.print("-");
			}
			for (int o = 0; o <= i; o++) {
				System.out.print("*");
			}
			for (int p = 1; p <= i; p++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 8; j++) {
				System.out.print("-");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("-");
			}
			for (int l = 4; l >= i; l--) {
				System.out.print("*");
			}
			for (int m = 3; m >= i; m--) {
				System.out.print("*");

			}
			System.out.println();
		}

	}
}
