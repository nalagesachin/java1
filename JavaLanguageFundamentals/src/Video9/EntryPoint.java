package Video9;

import javax.crypto.spec.RC2ParameterSpec;

public class EntryPoint {
	public static void main(String[] args) {
		Cal c = new Cal();
		c.a= 10;
		c.b= 20;
		c.plus();
		
		
		Cal c2 = new Cal();
           c2.a=500;
           c2.b= 200;
           c2.minus();
	}
	

}
