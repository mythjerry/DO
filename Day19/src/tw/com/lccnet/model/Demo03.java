package tw.com.lccnet.model;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

/*
 * 網路
 * 檔案
 * 資料庫
 * try{
 * 		運行可能會發生錯誤的程式碼
 * }catch(異常內容exception) {
 * 				發生錯誤會警告內容
 * }
 * 類別class
 * 建立物件，建立實體
 * 
 * 
 */

public class Demo03 {
			
		@Test
		public void test001() {
			try {
				System.out.println(10/0);
			}catch(RuntimeException e) {
				//java.lang.ArithmeticException: /by zero
				//e.printStackTrace();
				//修改要輸出得錯誤內容
				System.out.println("錯誤了");
				e.printStackTrace();
			}
		}
		
		@Test
		public void test002() {
			try {
				FileInputStream fis=new FileInputStream(new File("hello.txt"));
				int b;
				while( (b=fis.read() ) != -1) {
					System.out.println((char)b);
				}
				fis.close();
			} catch (FileNotFoundException e) {// 子類別
				e.printStackTrace();
			} catch (IOException e) {// 父類別
				e.printStackTrace();
			}
		}//先catch子別再catch父類別
		
		@Test
		public void test003() {
			try {
				FileInputStream fis=new FileInputStream(new File("hello.txt"));
				int b;
				while( (b=fis.read() ) != -1) {
					System.out.println((char)b);
				}
				fis.close();
			} catch (IOException e) {// IO包含所有IO相關子類別
				e.printStackTrace();
			}
		}
		
		@Test
		public void test004() {
			try (FileInputStream fis = new FileInputStream(new File("hello.txt"))) {
				int b;
				while( (b=fis.read() ) != -1) {
					System.out.println((char)b);
				}
				fis.close();
			} catch (Exception e) { // 異常最高父類別
				e.printStackTrace();
			}
		}
		
		@Test
		public void test005() {
			try (FileInputStream fis = new FileInputStream(new File("hello.txt"))) {
				int b;
				while( (b=fis.read() ) != -1) {
					System.out.println((char)b);
				}
				fis.close();
			} catch (Exception e) { // 異常最高父類別
				e.printStackTrace();
			}finally {
				//不管是否異常都一定會執行
				//System.out.println("finally");
			}
		}
}
