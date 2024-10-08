package tw.com.lccnet.model;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * 集合
 * 1.collection 單列結構 
 *  	List 元素有序 可以重複 有索引值
 * 2.Map 		 雙列結構
 */

public class Demo03 {
	
		@Test
		public void test01() {
			//前為父類別 x=new 建立子類別
			List list=new ArrayList();
			list.add("張三");
			list.add("李四");
			list.add("王五");
			list.add(2,"加入索引值");
			System.out.println(list.size());
			System.out.println(list.isEmpty());
			
			for(Object x:list) {
				System.out.println(x);
			}
		}
	
}
