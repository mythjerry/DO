package tw.com.lccnet.model;

import org.junit.jupiter.api.Test;

public class Demo02 {

		@Test
		public void test01() {
			//建立Student實體(物件)
			Student st=new Student();
			try {
				st.register(-12);
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		}		
}
class Student{
	int id;
	
		public void register(int id) throws MyException {
			if(id>0) {
				this.id=id;
			}else {
			//調用自訂異常MyException			
					throw new MyException("傳入的ID錯誤");
			}
		}
		
		@Override
		public String toString() {
			return "Student [id=" +id +"]";
		}
}