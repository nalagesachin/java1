package pattern_programs;

public class StarPattern05 {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//*****
// ****
//  ***
//   **
//    *
