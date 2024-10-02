package tw.com.lccnet.model;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/*
 * 集合
 * 1.collection 單列結構 
 *  	List 元素有序 可以重複 有索引值
 * 2.Map 		 雙列結構
 */

public class Demo03 {
	
	public void test02() {
		List list=new LinkedList();
		list.add("深田詠美"); //新增
		list.add("小梅惠奈");
		list.add("田中寧寧");
		System.out.println(list.size());
		for(Object x:list) {
			System.out.println(x);
		}
	}
	
	public void  test01() {
		//前為父類別 x=new 建立子類別
		List list = new ArrayList();
		list.add("深田詠美"); //新增
		list.add("小梅惠奈");
		list.add("田中寧寧");
		list.add(2,"加入索引值");
		list.remove(2);
		list.remove("小梅惠奈");
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.contains("小梅惠奈");
		for(Object x:list) {
			System.out.println(x);
		}
		Object[] f=list.
	}

}
