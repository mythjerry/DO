package tw.com.lccnet.model;

import org.junit.Test;

import tw.com.lccnet.model.bean.Person;
import tw.com.lccnet.model.bean.Students;
import tw.com.lccnet.model.bean.Teacher;
import tw.com.lccnet.model.bean.Worker;

public class Demo04 {
		
		@Test
		public void getCs() {
			//Person p=new Person(10000);
			 
			Students st=new Students(10);
			st.eat();
			st.sleep();
			st.read();
			
			Worker wo=new Worker(10,20);
			wo.eat();
			wo.sleep();
			wo.work();
			
			Teacher te=new Teacher(10,'a');
			te.eat();
			te.sleep();
		}
}
