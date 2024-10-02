package tw.com.lccnet.model.unittest;

import org.junit.jupiter.api.Test;
import tw.com.lccnet.model.bean.Student;
import tw.com.lccnet.model.dao.StudentDao;
import tw.com.lccnet.model.dao.impl.StudentDaoImpl;

//測試
public class ProjectTest {
		//測試新增
		@Test
		public void testAdd()  {
				//導入DAO 使用多態
			StudentDao dao=new StudentDaoImpl();
			Student stu=new Student();
			stu.setsName("LUV");
			stu.setsPass("1234657");
			stu.setsEmail("LUV@gmail.com");
			stu.setsAddress("Taiwan");
			
			dao.add(stu);
		}
		//測試刪除
		@Test
		public void testDelete() {
				StudentDao dao=new StudentDaoImpl();
				dao.delete(2);
		}
		//測試更新
		@Test
		public void testUpdate() {
			StudentDao dao=new StudentDaoImpl();
			Student stu=new Student();
			stu.setsName("LUV");
			stu.setsPass("7654321");
			stu.setsEmail("LUV@gmail.com");
			stu.setsAddress("Taiwan");
			stu.setsId(4);
			dao.update(stu);
		}
		
}
