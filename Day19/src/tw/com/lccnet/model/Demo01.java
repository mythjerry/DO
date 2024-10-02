package tw.com.lccnet.model;

import java.util.Date;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Demo01 {
		//異常處理
	@Test
	public void test01() {
		//java.lang.ArithmeticException: / by zero
		System.out.println(10/0);
	}
	
	@Test
	public void test02() {
		try {
			int [ ] s= {10,20,30,40};
			System.out.println(s[5]);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test03() {
		//java.util.InputMismatchException
		try {
			Scanner scanner=new Scanner(System.in);
			int i=scanner.nextInt();
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test04() {
		//java.lang.ClassCastException:
		Object obj=new Date();
		String str=(String)obj;
		System.out.println(str);
	}
}
