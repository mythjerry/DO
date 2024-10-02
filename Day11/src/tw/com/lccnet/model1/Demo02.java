package tw.com.lccnet.model1;

import org.junit.jupiter.api.Test;

public class Demo02 {
	
		@Test
		public void test01() {
			Person p1=setPerson();
			p1.pMethod();
		}
	
		public Person setPerson() {
			//return new Person();
			//return new Worker();
			return new Student1();
		}

}
