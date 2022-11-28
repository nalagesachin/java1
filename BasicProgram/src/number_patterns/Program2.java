package number_patterns;

public class Program2 {
	public static void main(String[] args) {
		int s = 9;
		char a='*';
		for (int i = 0; i <= s; i++) {
			for (int j = (s*3 ); j >= i; j--) {
				System.out.print(" ");}
			for (int k = 0; k <= i*2; k++) {
				System.out.print(a);}
			System.out.println();}
		for (int i = 0; i <= s; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");}
			for (int k = s*2; k >= i*2; k--) {
				System.out.print(a);}
			for (int m = 2; m <= (s*2); m++) {
				System.out.print(" ");}
			for (int n = 0; n <= i; n++) {
				System.out.print("  ");}
			for (int o = s*2; o >= i*2; o--) {
				System.out.print(a);}
			System.out.println();}
		for (int i = 0; i <= s; i++) {
			for (int j = s-1; j >= i; j--) {
				System.out.print(" ");}
			for (int k = 0; k <= i*2; k++) {
				System.out.print(a);}
			for (int m =2; m <= s*2; m++) {
				System.out.print(" ");}
			for (int n = s; n >= i; n--) {
				System.out.print("  ");}
			for (int o = 0; o <= i*2; o++) {
				System.out.print(a);}
			System.out.println();
		}
		for (int i = 0; i <= s; i++) {
			for (int j = 0; j <= s*2; j++) {
				System.out.print(" ");}
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");}
			for (int l = s*2; l >= i*2; l--) {
				System.out.print(a);}
			System.out.println();}
	}}
