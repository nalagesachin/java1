package notes;

public class arreyMemoryAllocation {

	public static void main(String[] args) {
		int[] arraye = new int[5];
		arraye[0] = 10;
		arraye[1] = 20;
		arraye[2] = 30;
		arraye[3] = 40;		
		arraye[4] = 60;
		
		System.out.println(arraye[0]);
		System.out.println(arraye[1]);
		System.out.println(arraye[2]);
		System.out.println(arraye[3]);
		System.out.println(arraye[4]);
		System.out.println(">>>>>>>>>>>>>>>>>>");
		
		arraye [0] = 30;
		System.out.println(arraye[0]);
		
		
		



	}

}
