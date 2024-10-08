package tw.com.lccnet.window.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import tw.com.lccnet.window.bean.Employee;
import tw.com.lccnet.window.dao.EmployeeDao;
import tw.com.lccnet.window.dbutils.DBUtil;

public class EmployeeDaoImpl  implements EmployeeDao{

	@Override //新增
	public void add(Employee employee) {
		//呼叫資料庫連接類
		Connection conn=DBUtil.getDBUtil().getConnection();
		String addSQL="insert into employee(ename,eemail,epass,eaddress)values(?,?,?,?)";
		PreparedStatement ps=null;
		try {
			ps=conn.prepareStatement(addSQL);
			ps.setString(1, employee.getEname());
			ps.setString(2, employee.getEemail());
			ps.setString(3, employee.getEpass());
			ps.setString(4, employee.getEaddress());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.getDBUtil().close(ps);
			DBUtil.getDBUtil().close(conn);
		}
	}

	@Override //刪除
	public void delete(int id) {
		
	}

	@Override//更新
	public void update(int id) {
		
	}

	@Override//搜尋
	public List<Employee> search() {
		return null;
	}

}
