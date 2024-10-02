package tw.com.lccnet.model;

public class Demo03 {

		public static void main(String[] args) {
			//靜態static只能呼叫靜態static
			method01();
			//static不能呼叫一般方法
			//method02();
		}
		//專案內的靜態方法 5%
		public static void method01() {
			
		}
		//一般方法 95%
		public void method02() {
			
		}
}
