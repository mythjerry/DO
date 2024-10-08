package tw.com.lccnet.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Demo01 {

		@Test
		public void test01() {
			String name="你是哪裡來的小丑"; //ASCII
			//byte [] byt=name.getBytes(); //UTF-8
			byte [] byt=name.getBytes("Big5");//UTF-8
			System.out.println(byt.length); 
			System.out.println(Arrays.toString(byt));
			
			String name1="你是哪裡來的小丑"; //ASCII
			String rs=new String(name1); //預設UTF-8
			System.out.println(rs);
		}
		
		@Test
		public void test02() throws Exception{
			InputStream is=new FileInputStream("D:\\Java_File\\Day24\\src\\data.txt");
			
			int b1;
			while((b1=is.read()) !=-1) {
				System.out.println((char)b1);
			}
		}
}
