package tw.com.lccnet.model;

import java.time.LocalDate;
import java.time.Period;

import org.junit.Test;

public class Demo02 {
	
		@Test
		public void test01() {
				//當前日期
				LocalDate toDay=LocalDate.now();
				System.out.println(toDay);
				//出生日期
				LocalDate birthday=LocalDate.of(2000, 05, 15);
				System.out.println(birthday);
				//計算歲數
				Period per=Period.between(birthday, toDay);
				System.out.println(per.getYears());
				System.out.println(per.getMonths());
				System.out.println(per.getDays());
		}

}
