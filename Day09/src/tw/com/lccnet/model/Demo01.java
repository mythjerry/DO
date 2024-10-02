package tw.com.lccnet.model;

import org.junit.jupiter.api.Test;
		/*
		* 安全修飾詞
		* private	私有化
		* protected	保護的
		 * public	公開的
		*  空著   預設
		*/
			
public class Demo01 {
	
		//屬性(class內，方法內)需要加上安全修飾詞，整個class都可以讀取
		private Integer id1=666; //屬性
		private int id3; //屬性 private Integer id3(自動封裝)
		
		public void getDemo01() {
			//變數 方法內。只有這個{ }內可以讀取
			int id2=80; //變數
			Integer id5=10;  //自動解封裝
			//自動封裝 --> int id5=10;
			System.out.println(id5);
		}
			@Test
		public void test01() {
				int x=10;
				System.out.println(id1);
				//System.out.println(id2); //error
				System.out.println(x);
			}

}
