package tw.com.lccnet.model.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
		
		/*
		 * 常數
		 * JDBC_DRIVER 資料庫連結的Driver
		 * JDBC_URL 資料庫連結類
		 * JDBC_NAME	資料庫登入帳號
		 * JDBC_PASS	 	資料庫登入密碼
		 */
		private final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
		private final String JDBC_URL="jdbc:mysql:///project";
		private final String JDBC_NAME="root";
		private final String JDBC_PASS="Password123";
		public Connection conn;
		
		//私有化建構子
		private JdbcUtils()  {
			
				try {
						Class.forName(JDBC_DRIVER);
				} catch (ClassNotFoundException e) {
						e.printStackTrace();
				}
		}
		
		//靜態方法回傳本身class
		public static JdbcUtils getJdbc() {
				return new JdbcUtils(); //建立實體
		}		
		
		public Connection getUtils() {
				try {
					conn=DriverManager.getConnection(JDBC_URL,JDBC_NAME ,JDBC_PASS);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return conn;
		}
		
		//關閉Connection 連接類
		public void close(Connection conn) {
			if(conn != null ) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		//關閉sql語法 傳送
		public void close(PreparedStatement ps) {
				if(ps != null) {
					try {
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
		}
		//關閉sql語法 傳送
		public void close(Statement st) {
			if(st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		//關閉承接結果內容類別
		public void close(ResultSet rs) {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
}
