package tw.com.lccnet.model03;

//介面

/*
 * 1.只能有抽象方法，不可以有一般方法
 * 2.不能建立實體
 * 3.有default方法，可以複寫方法
 */
public interface interface01 {
		//抽象方法
		public abstract void interface001();
		//抽象方法
		public void interface002();
		//default方法
		default void getMethod() {
			
		}
		
		//一般方法，ERROR
		/*
		public void getMethod02() {
			
		}
		*/
}
