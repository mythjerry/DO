package tw.com.lccnet.model;

/*抽象類別
 * 1.抽象方法
 * 1-1.有方法頭，無方法體
 * 1-2.加上抽象關鍵字abstract
 * 1-3.抽象方法要放置於抽象類別
 * 2.抽象類別
 * 2-1.抽象類別中可以有抽象方法跟一般方法
 * 2-2.抽象類別需要時做抽象方法
 * 2-3.抽象類別不建議建立實體
 * 2-4.抽象類別可以使用建構子
 * 2-5.可以使用屬性，可以使用安全修飾子
 * 
 */

public abstract class Demo04 {
			private String name;
	
			//建構子
			private Demo04() {
				
			}
	
			//抽象方法
			public abstract void getMethod();
			
			//一般方法
			public void method01() {
				
			}
}
