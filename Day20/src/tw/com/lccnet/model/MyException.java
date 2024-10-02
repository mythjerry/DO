package tw.com.lccnet.model;
/*
 * 自訂異常
 */

public class MyException extends Exception{
		/**
		 * 版本號 設定
		 */
		private static final long serialVersionID=1L;

		public MyException() {
			
		}
		
		public  MyException(String msg) {
				super(msg);
		}
}