package tw.com.lccnet.model.bean;
/*
 * 1.將同名方法抽取到父類別
 * 2.加上繼承得關鍵字extends
 */

//繼承(方法) Person的子類別
public class Worker extends Person{
		
		//繼承父類別的2個方法 eat sleep

		public Worker(int a, int b) {
		super(a, b);
	}

		public void work() {
		System.out.println("Worker-work");
		}
}
