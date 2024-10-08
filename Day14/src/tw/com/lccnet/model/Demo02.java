package tw.com.lccnet.model;

import org.junit.Test;

public class Demo02 {
	
		@Test
		public void test01() {
			Switch s1=()->{
				System.out.println("Lamdba表達式");
			};
			s1.swit();
		}
		
		public void go(Switch s) {
			s.swit();
		}
}

//函數式介面，限制:只能有一個抽象方法
@FunctionalInterface
interface Switch {
		//抽象方法
		void swit();
}
