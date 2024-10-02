package tw.com.lccnet.model.bean;

public class Employee {
			//屬性
			//建構子
			//方法
			/*
			 * 建構子
			 * 1.建構子需要公開
			 * 2.無回傳值
			 * 3.可進行傳入，但無法回傳 
			 */
		//有傳入建構子需要跟屬性整合
		
		//屬性
		private int id;
		private String name;
		
		//建構子	
		public Employee() {
					//無傳入建構子
			}
			
			public Employee(int id) {
				super();
				this.id=id;
			}
			
			public Employee(String name) {
				super();
				this.name=name;
			}
			
			public Employee(int id, String name) {
				super();
				this.id=id;
				this.name=name;
			}
			//方法1
			public void method01() {
				System.out.println("method01----");
			}
			//方法2
			public void method02() {
				System.out.println("method02----");
			}
}
