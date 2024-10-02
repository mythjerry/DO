package tw.com.lccnet.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tw.com.lccnet.model.bean.Student;
import tw.com.lccnet.model.dao.StudentDao;
import tw.com.lccnet.model.jdbc.JdbcUtils;

public class StudentDaoImpl implements StudentDao{

		@Override
		public void add(Student stud) {
			//連接資料庫
			Connection conn=JdbcUtils.getJdbc().getUtils();
			String addSQL="insert into student(sname ,spass ,semail ,saddress)values(?,?,?,?)";
			PreparedStatement ps=null;
			try {
				ps=conn.prepareStatement(addSQL);
				ps.setString(1, stud.getsName());
				ps.setString(2, stud.getsPass());
				ps.setString(3, stud.getsEmail());
				ps.setString(4, stud.getsAddress());
				ps.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		//刪除
		@Override
		public void delete(int id) {
			Connection conn=JdbcUtils.getJdbc().getUtils();
			String delete="delete from student where sid=?";
			PreparedStatement ps=null;			
			try {
				ps=conn.prepareStatement(delete);
				ps.setInt(1, id);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public void update(Student stu) {
			Connection conn=JdbcUtils.getJdbc().getUtils();
			String update="update student set sname=?,spass=?,semail=?,saddress=? where sid=?";
			PreparedStatement ps=null;
			try {
				ps=conn.prepareStatement(update);
				ps.setString(1, stu.getsName());
				ps.setString(2, stu.getsPass());
				ps.setString(3, stu.getsEmail());
				ps.setString(4, stu.getsAddress());
				ps.setInt(5, stu.getsId());
				ps.executeLargeUpdate();			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
