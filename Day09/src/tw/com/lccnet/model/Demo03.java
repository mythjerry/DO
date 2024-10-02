package tw.com.lccnet.model;

import org.junit.Test;
import tw.com.lccnet.model.bean.*;

import tw.com.lccnet.model.bean.Book;

public class Demo03 {
	
		@Test
		public void test01() {
				Book bk=new Book("Java", 780L, "J123", true);
				System.out.println(bk);
				Book bk1=new Book("Python", 650L, "P123", false);
				System.out.println(bk1);
		}
		@Test
		public void test02() {
			Book ak1=new Book();
			ak1.setBookName("Java");
			ak1.setBookPrice(780L);
			ak1.setBookNumber("J123");
			ak1.setBookIn_out(true);
			System.out.println(ak1);
			
			Book ak2=new Book();
			ak2.setBookName("Python");
			ak2.setBookPrice(650L);
			ak2.setBookNumber("P123");
			ak2.setBookIn_out(false);
			System.out.println(ak2);			
		}
		@Test
		public void test03() {
			Book ck1=new Book();
			//輸入 set
			ck1.setBookName("Java 1");
			ck1.setBookPrice(880L);
			ck1.setBookNumber("J123");
			ck1.setBookIn_out(true);
			//輸出  get
			System.out.println("書名:"+ck1.getBookName()+
					"\n價錢:"+ck1.getBookPrice()+
					"\n書號"+ck1.getBookNumber()+
					"\n庫存"+ck1.getBookIn_out());
		}
}
