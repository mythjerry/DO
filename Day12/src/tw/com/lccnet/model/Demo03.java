package tw.com.lccnet.model;

import java.util.Arrays;

import org.junit.Test;

//
public class Demo03 {
	
		@Test
		public void test01() {
			Integer[] arr= {34,12,67,8};
			Arrays.sort(arr); //soft進行排序
			System.out.println(Arrays.toString(arr));
		}

}
