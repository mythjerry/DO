package tw.com.lccnet.model;

import org.junit.jupiter.api.Test;

/*
 * Lambda 表達式JDK8以後出的新語法
 * Lambda 表達式只能簡化函數式介面的內部類寫法形式
 */

public class Demo01 {
	
	@Test
	public  void test01() {
		
		Animal ani=new Animal() {
			//實作抽象方法
			public void run() {
				System.out.println("run method");
			}
		};
		ani.run();
	}
	
abstract class Animal{
		public abstract void run();	
}

}
