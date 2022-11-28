package number_patterns;


public class Program1 {
	public static void main (String [] args) {
       char n='$'; 
		int s= 9;
		for (int i=0; i<=s; i++) {
			for (int j=0; j<=s*2; j++) {
				System.out.print(" ");}
			for (int j=s; j>=i; j--) {
				System.out.print(" ");}
			for (int k=0; k<=i; k++){
			 System.out.print(" "+n);}
			System.out.println();}
		for (int i = 0; i <= s; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");	}
			for (int k = s; k >= i; k--) {
				System.out.print(" "+n);}
			for (int j2 = 0; j2 <=s*2; j2++) {
				System.out.print(" ");}
			for (int j1 = 1; j1 <= i; j1++) {
				System.out.print("  ");}
			for (int k1 = s; k1 >= i; k1--) {
				System.out.print(n+ " ");}
			System.out.println();}
		for (int i = 0; i <= s; i++) {
			for (int j = s; j >= i; j--) {
				System.out.print(" ");}
			for (int k = 0; k <= i; k++) {
				System.out.print(" "+n);}
			for (int j1 = (s*2 -1); j1 >= i; j1--) {
				System.out.print("  ");}
			for (int k = 0; k <= i; k++) {
				System.out.print(" "+n);}
			System.out.println();}
		for (int i = 0; i <= s; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");}
			for (int j1 = 0; j1 <= s*2; j1++) {
				System.out.print(" ");}
			for (int k = s; k >= i; k--) {
				System.out.print(" "+n);}
			System.out.println();}
		System.out.println("WISHING HAPPY DIWALI");
     }}
