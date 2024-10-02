package tw.com.lccnet.model;

import org.junit.Test;

public class Demo06 {
	
		@Test
		public void getMethod() {
			Demo05 d5=new Demo05();
			//System.out.println(id); //error
			System.out.println(d5.age);	//public
			System.out.println(d5.email);		//default
			System.out.println(d5.name);		//protected
		}

		
}