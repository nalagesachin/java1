package pattern_programs;

public class StarPattern00 {
	public static void main(String[] args) {
		int line=5;
		int colume =5;
		for (int i= 0; i< line; i++) {
			
			int ch = 9;
			
			for(int j=0; j< colume; j++) {
				System.out.print(ch-- + " ");
				
				ch = ch-1; //9-1=8
			}
		System.out.println();
		colume--;//8-1=7
		
		}
	}

}
