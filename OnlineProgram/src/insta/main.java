package insta;

public class main {
	public static void main(String[] args) {
		//negativ number
		
		int number =-60;
		System.out.println("factor of"+ number+ "are:");
		
		//run loop from -60 to 60
		for (int i=number ; i<= Math.abs(number); ++i)
		//skip iteration i=0
			if (i==0) {
				continue;
			}
			else {
				if (number %i == 0)
				System.out.println(i+" ");
				
			}
	}

}
