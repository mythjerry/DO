package tw.com.lccnet.model;

import org.junit.Test;

public class Demo05 {
		//私有化的範圍只在本身class內
		private int id=10;
		protected String name;
		String email="abc123@gmail.com";
		public int age=30;
		
		@Test
		public void getMethod() {
			System.out.println(id);
			System.out.println(name);
			System.out.println(email);
			System.out.println(age);
		}
}
