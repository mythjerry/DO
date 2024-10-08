package tw.com.lccnet.window.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC
 * 程式與資料庫的連結類別
 */

public class DBUtil {
		//資料庫連結的Driver(常數)
		private final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
		//資料庫連結的URL(常數)，windowcrud名稱
		private final String JDBC_URL="jdbc:mysql://127.0.0.1:3306/windowcrud";
		//資料庫連結的帳號(常數)
		private final String JDBC_USER="root";
		//資料庫連結的密碼(常數)
		private final String JDBC_PASS="Password123";
		//資料庫連接類
		private Connection conn=null;
	
		//私有化建構子
		private DBUtil() {
			try {
				Class.forName(JDBC_DRIVER);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}		
		}
		//回傳DBUtil的靜態方法
		public static DBUtil getDBUtil() {
			return new DBUtil();
		}
		//回傳連接類，進行資料庫連接
		public Connection getConnection() {
			try {
				DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;
		}
		
		//方法多載，import java.sql.Connection;
		public void close(Connection conn) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		//方法多載，import java.sql.PreparedStatement;
		public void close(PreparedStatement ps) {
					try {
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
		}
		//方法多載，import java.sql.Statement;
		public void close(Statement st) {
					try {
						st.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
		}
		//方法多載，import java.sql.ResultSet;
		public void close(ResultSet rs) {
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
		}
}
