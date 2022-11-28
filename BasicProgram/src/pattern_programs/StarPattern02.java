package pattern_programs;

public class StarPattern02 {
	public static void main(String [] args ) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				//i=6 6<=5 j=1; 6<=5
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

//* 
//** 
//*** 
//**** 
//***** 