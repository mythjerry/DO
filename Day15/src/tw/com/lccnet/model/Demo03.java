package tw.com.lccnet.model;

import java.util.List;
import org.junit.Test;

public class Demo03 {
	/*
	 * 不可變的集合
	 */
		public void test02() {
			List<String> list=List.of("AA","BB","CC","DD");
		}
	
		public void test01( ) {
			List<Number> list=List.of(23.4,45.1,45,78.5,12,123);
			System.out.println(list);
			Number m =list.get(1);
			System.out.println(m);
		}

}
