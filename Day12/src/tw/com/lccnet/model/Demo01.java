package tw.com.lccnet.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class Demo01 {
	
	/*
	 * java8 新增Date 日期類
	 * LocalDate
	 * LocalTime
	 * LocalDateTime
	 * Instant 時間戳具
	 * DateTimeFormatter 時間格式化和解析
	 * Duration 計算2個時間的間隔
	 * Period 計算2個日期的間隔
	 */
		
		@Test
		public void test01() {
			//創建一個Date類對象，代表系統此刻時間對象
			Date d=new Date();
			System.out.println(d);
			//取得時間
			long time=d.getTime();
			System.out.println(time);
			//取得現在時間
			long time1=System.currentTimeMillis();
			System.out.println(time1);
		}
		
		@Test
		public void test02( ) {
			Date d=new Date();
			//格式化時間
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss ");
			String rs=sdf.format(d);
			System.out.println(rs);
		}
		
		@Test
		public void test03() {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss ");
			//時間以毫秒1000，200秒後的時間
			long now=System.currentTimeMillis();
			//System.out.println(now);
			String a1=sdf.format(now);
			System.out.println(a1);
			long twoTime=System.currentTimeMillis()+200*1000; //200秒後的時間
			//System.out.println(twoTime);
			String a2=sdf.format(twoTime);
			System.out.println(a2);
		}
		
		@Test
		public void test04() {
			//日曆
			Calendar cal=Calendar.getInstance();
			System.out.println(cal);
			int year=cal.get(Calendar.YEAR);
			System.out.println(year);
			int mm=cal.get(Calendar.MONTH)+1;
			System.out.println(mm);
			int days=cal.get(Calendar.DAY_OF_YEAR);
			System.out.println(days);
		}
		
		@Test
		public void test05() {
			LocalDate newDate=LocalDate.now();
			System.out.println("今天日期"+newDate);
			
			int year=newDate.getYear();
			System.out.println(year); //年
			
			int month=newDate.getMonthValue();
			System.out.println(month);//月

			int day=newDate.getDayOfMonth();
			System.out.println(day);//日
			
			LocalDate Id=LocalDate.of(2000, 03, 25); //印出自訂時間
			System.out.println(Id);
		}

}
