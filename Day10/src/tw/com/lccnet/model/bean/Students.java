package tw.com.lccnet.model.bean;

import org.junit.Test;

//繼承(方法) Person的子類別
public class Students extends Person{

		public Students(int a) {
			//super呼叫父類別的建構子
		super(a);
		}
		
		@Test
		public void getPerson() {
			System.out.println(id);
			System.out.println(super.id);
		}

		//繼承父類別的2個方法 eat sleep
		public void read() {
			System.out.println("Students-read");
		}
}
