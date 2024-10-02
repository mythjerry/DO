package tw.com.lccnet.model;

import org.junit.jupiter.api.Test;

public class Demo01 {
	
		//拋出異常，需調用實作try{ }catch{ }
		public void method01()  throws RuntimeException {
			int i=10;
			System.out.println(i/0);
		}
		@Test
		public void test01() throws Exception{
				method01();
		}
		
		@Test
		public void test02() {
			//1
			try {
				test01();
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("錯誤");
			}
		}
		
		@Test
		public void test03() {
			try {
				method01();
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("error");
			}
		}
}
