package pattern_programs;

public class starPattern17 {
public static void main(String[] args) {

			int s=5;
			for (int i = 0; i <= s; i++) {
				for (int j = s+10; j >= i; j--) {
					System.out.print("-");
				}
				for (int k = 0; k <= i; k++) {
					System.out.print("*");
				}
				for (int l =s-4; l <= i; l++) {
					System.out.print("*");
				}
				System.out.println();

			}
			for (int i = 0; i <= s; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("-");
				}
				for (int k = s; k >= i; k--) {
					System.out.print("*");
				}
				for (int l = s-1; l >= i; l--) {
					System.out.print("*");
				}
				for (int m = 0; m <= s+2; m++) {
					System.out.print("-");
				}
//				for (int m1 = 1; m1 <= i; m1++) {
//					System.out.print("-");
//				}
				for (int n = 0; n <= i; n++) {
					System.out.print("--");
				}
				for (int o = s; o >= i; o--) {
					System.out.print("*");
				}
				for (int p = s-1; p >= i; p--) {
					System.out.print("*");
				}
				System.out.println();

			}
			for (int i = 0; i <= s; i++) {
				for (int j = s; j >= i; j--) {
					System.out.print("-");
				}
				for (int k = 0; k <= i; k++) {
					System.out.print("*");
				}
				for (int l = s-3; l <= i; l++) {
					System.out.print("*");
				}
				for (int m = 0; m <= s+3; m++) {
					System.out.print("-");
				}
				for (int m1 = s-1; m1 >= i; m1--) {
					System.out.print("-");
				}
				for (int n = s; n >= i; n--) {
					System.out.print("-");
				}
				for (int o = 0; o <= i; o++) {
					System.out.print("*");
				}
				for (int p = s-3; p <= i; p++) {
					System.out.print("*");
				}
				System.out.println();

			}
			for (int i = 0; i <= s; i++) {
				for (int j = 0; j <= s+4; j++) {
					System.out.print("-");
				}
				for (int k = 0; k <= i; k++) {
					System.out.print("-");
				}
				for (int l = s; l >= i; l--) {
					System.out.print("*");
				}
				for (int m = s-1; m >= i; m--) {
					System.out.print("*");

				}
				System.out.println();
			}

		}
	

}

