package tw.com.lccnet.model1;

import org.junit.Test;

public class Demo03 {
	
		@Test
		public void test01() {
				getPerson(new Person());
				getWork(new Worker());
				getStudent(new Student1());
		}
		
		@Test
		public void  getPerson1() {
				getPerson(new Person());
				getPerson(new Worker());
				getPerson(new Student1());
		}
		
		//使用繼承，傳入父類別
		public void getPerson(Person person) {
			person.pMethod();
		}
		
		//一般方法並傳入Worker 實體
		public void getWork(Worker worker) {
				worker.wMethod();
		}
		
		//一般方法並傳入Student1 實體
		//(傳入的實體 傳入的變數名稱)
		public void getStudent(Student1 student1) {
				student1.sMethod();//變數名稱下的方法，呼叫Student1.java下的sMethod()
		}
}
