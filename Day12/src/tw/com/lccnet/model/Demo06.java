package tw.com.lccnet.model;

import org.junit.jupiter.api.Test;

public abstract class Demo06 {
		@Test
		public void test01() {
				//抽象方法建立實體，需實做抽象方法
				Demo05 d5=new Demo05() {
					
						@Override
						public int method() {
							return 0;
						}
						@Override
						public int method01(int y) {
							return 0;
						}
				};
		}
}
