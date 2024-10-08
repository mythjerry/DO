package tw.com.lccnet.model03;

import org.junit.Test;

public class Test02 {
	
		@Test
		public void test01() {
			//不建議建立實體
			Interface01 i1=new Interface01() {
				
				@Override
				public void Interface002() {
					System.out.println("interface002");					
				}				
				@Override
				public void Interface001() {
					System.out.println("interface001");					
				}
			};
			i1.Interface001();
			i1.Interface002();
		}
		
		@Test
		public void test02() {
			NoneClass  none=new NoneClass();
			none.Interface001();
			none.Interface002();
		}
}
