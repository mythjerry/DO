package tw.com.lccnet.model;

import java.util.HashMap;
import java.util.Map;

public class Demo02 {

	public static void main(String[] args) {
		
	}
			/*
			 * Map <key,value>常用於購物
			 * HashMap 無排序，不重複，無索引，值不限定
			 * TreeMap 排序，不重複，無損引，值不限定
			 */
		public void test01() {
			Map<String, Integer> maps=new HashMap<String, Integer>();
			
			maps.put("iphone", 42000);
			maps.put("Android", 32000);
			maps.put("Watch", 22000);
			maps.put("shoes", 12000);
			System.out.println(maps);
		}

}
