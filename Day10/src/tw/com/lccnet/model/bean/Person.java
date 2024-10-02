package tw.com.lccnet.model.bean;
//父類別，繼承下子類別都可以呼叫父類別方法
public class Person {
	
		public int id=10;
	
		/*
		 *建立每一個class 都有一個空參數建構子
		 */
		public Person(int a) {
			//建構子
			System.out.println("這是父類別建構子"+a);
		}
		public Person(int a,int b) {
			System.out.println("這是父類別建構子"+a);
		}
		public Person(int a,char x) {
			System.out.println("這是父類別建構子"+a);
		}
	
		public void eat() {
			System.out.println("Person-eat");
		}
		
		public void sleep() {
			System.out.println("Person-sleep");
		}
}
