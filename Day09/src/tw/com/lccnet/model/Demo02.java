package tw.com.lccnet.model;

import org.junit.Test;

public class Demo02 {

	
		@Test
		public void test01() {
			//建立實體，連接空參數建構子
			Employee emp =new Employee();
			//建立實體，連接一個參數建構子
			Employee emp1 =new Employee(10);
			emp1.method01();
			//建立實體，連接二個參數建構子
			Employee emp2 =new Employee(10,"Tom");
			emp2.method01();
		}
}
