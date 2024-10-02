package tw.com.lccnet.model;

import org.junit.jupiter.api.Test;

public class Demo03 {
	//透過建構子給值
	@Test
	public void test01() {
		//建立實體
		Iphone ip=new Iphone(1,"128GB","White");
		System.out.println("You buy:"+ip);
		//建立實體
		Iphone ip1=new Iphone(1,"256GB","Sliver");
		System.out.println("You buy:"+ip1);
	}
	
	/*
	 * 透過方法進行給值
	 */
	@Test
	public void test02() {
		Iphone p1=new Iphone();
		//可以選擇要的值
		p1.setNum(2);
		p1.setMey("1TB");
		p1.setColor("Black");
		System.out.println(p1);
	}
}
