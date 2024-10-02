package tw.com.lccnet.model;

import org.junit.jupiter.api.Test;

public class Test01 {
	
		//set
		@Test
		public void test01() {
			//建立Student 實體
			Student stu=new Student();
			stu.setsId(1);
			stu.setsName("Tom");
			stu.setsAddress("Taiwan");
			System.out.println(stu);			
		}
		//建構子
		@Test
		public void test02() {
			//多個Student
			Student[] stu= {
					new Student(1,"Tom","Taiwan"),
					new Student(2,"Jason","Taiwan"),
					new Student(3,"Many","Taiwan"),
					new Student(4,"Chan","Taiwan"),	};
			for(int i=0;i<stu.length;i++) {
				System.out.println(stu[i]);
			}
		}
		
		@Test
		public void test03() {
			//多個Student
			Student[] stu= {
					new Student(1,"Tom","Taiwan"),
					new Student(2,"Jason","Taiwan"),
					new Student(3,"Many","Taiwan"),
					new Student(4,"Chan","Taiwan"),	};
			for(int i=0;i<stu.length;i++) {
				System.out.println(stu[i].getsId());
				System.out.println(stu[i].getsName());
				System.out.println(stu[i].getsAddress());
			}
		}
		@Test
		public void test04() {
			Student stu1=new Student(1,"Tom","Taiwan");
			Student stu2=new Student(2,"Jason","Taiwan");
			Student stu3=new Student(3,"Many","Taiwan");
			Student stu4=new Student(4,"Chan","Taiwan");			
			Student[] array= {stu1,stu2,stu3,stu4};
			for(int i=0; i<array.length; i++) {
				System.out.println(array[i].getsId());
				System.out.println(array[i].getsName());
				System.out.println(array[i].getsAddress());
			}
		}
		public void test05() {
			Student stu1=new Student();
			stu1.setsId(1);
			stu1.setsName("Tom");
			stu1.setsAddress("Taiwan");
			Student stu2=new Student();
			stu2.setsId(2);
			stu2.setsName("Jason");
			stu2.setsAddress("Taiwan");
			Student stu3=new Student();
			stu3.setsId(3);
			stu3.setsName("Mary");
			stu3.setsAddress("Taiwan");
			Student stu4=new Student();
			stu4.setsId(4);
			stu4.setsName("Chan");
			stu4.setsAddress("Taiwan");
			
			Student[] array= {stu1,stu2,stu3,stu4};
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i].getsId());
				System.out.println(array[i].getsName());
				System.out.println(array[i].getsAddress());
			}
			
		}
		
}
