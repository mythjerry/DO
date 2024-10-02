package tw.com.lccnet.model1;

public class Worker  extends Person{
	
		public void wMethod() {
			System.out.println("Worker");
		}
		//同名方法
		public void pMethod() {
			System.out.println("Worker");
		}
}
