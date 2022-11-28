package pattern_programs;

public class StarPattern000 {
	public static void main(String[] args) {
		int s=12;
		for (int i=1; i<=s; i=i+3) {
			for (int j=s; j>=i ; j=j-3){
				System.out.print(j+" ");
			}
			System.out.println();
		} 		
		}
}
