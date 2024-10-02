package tw.com.lccnet.model;
/*
 * String的常用方法
 */

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

import org.junit.jupiter.api.Test;

public class Demo04 {
		String str="abcdefg";
		String str1="abcd";
		String str2=new String("abcd1"); //建立實體
		@Test
		public void test01() {
				//字串長度
				System.out.println(str.length());
		}
		@Test
		public void test02() {
				System.out.println(str.charAt(4));
		}		
		@Test
		public void test03() {
				System.out.println(str.compareTo(str1));
		}
		@Test
		public void test04() {
			//0 2個字串相同
			//-1 2個字串不相同
			System.out.println(str1.indexOf(str2));
		}
		@Test
		public void test05() {
			//concat連接2個字串
			str=str.concat("wwww");
			System.out.println(str);
		}
		@Test
		public void test06() {
			byte[] c=str.getBytes();
			for(int i=0; i<c.length; i++) {
				System.out.println((char)c[i]);
			}
		}
		@Test
		public void test07() {
			System.out.println(str.replace('d','x'));
		}
		@Test
		public void test08() {
			//將英文字轉成大寫
			System.out.println(str.toUpperCase());
			//將英文字轉成小寫
			System.out.println(str.toLowerCase());
		}
		@Test
		public void test09() {
			//清空前面跟後面的空格中間得空格會被刪除
			String c="  ab  cd  ";
			System.out.println(c.trim());
		}
}
