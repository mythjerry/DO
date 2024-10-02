package tw.com.lccnet.model;

public class Demo02 {
	
		public Demo02() {
			System.out.println("建構子");
		}
		//代碼塊
		{
			System.out.println("代碼塊");
		}
		//靜態static代碼塊
		static {
			System.out.println("static代碼塊");
		}
}
