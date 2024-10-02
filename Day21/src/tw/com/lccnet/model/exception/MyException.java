package tw.com.lccnet.model.exception;

public class MyException extends Exception{
		//設定版本號
		private static final long serialVersionUID=1L;
		public MyException() {
			
		}
		
		public MyException(String msg) {
			super(msg);
		}
}
