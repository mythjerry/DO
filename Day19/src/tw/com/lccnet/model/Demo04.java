package tw.com.lccnet.model;

import org.junit.jupiter.api.Test;

public class Demo04 {
		@Test
		public void test10() {
			try {
				int i=10;
				System.out.println(i/0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
