package tw.com.lccnet.model;

public class Demo01 {

	public static void main(String[] args) {
		/*字串型態無法使用在switch
		 * String 可使用
		 */
		String a="aaa";
		
		switch(a) {
		case "aaa":
			System.out.println("1");
			break;
		case "bbb":
			System.out.println("2");
			break;
		case "ccc":
			System.out.println("3");
			break;
		}
	}

	public static void method04() {
		/*字母型態無法使用在switch
		 * char 可使用
		 */
		char a='F';
		
		switch(a) {
		case 'A':
			System.out.println("1");
			break;
		case 'B':
			System.out.println("2");
			break;
		case 'F':
			System.out.println("3");
			break;
		}
	}

	public static void method03() {
		/*浮點數型態無法使用在switch
		 * float/double 無法使用
		 */
		double a=1.1f;
		
		switch(a) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		}
	}

	public static void method02() {
		/*
		 * 數值型態 
		 * byte/short/int  可以使用
		 * long 無法使用於switch
		 */
		byte a=1;
		//long 無法使用於switch 
		//long a=5L; 下面switch(a)會跑錯誤		
		
		switch(a) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		}
	}

	public static void method01() {
		switch (10) {
		case 2:
			  System.out.println("2");
			  break;
		case 4:
			  System.out.println("4");
			  break;
		case 6:
			  System.out.println("6");
			  break;
		case 8:
			  System.out.println("8");
			  break;
		case 10:	
			  System.out.println("10");
			  break;
		}
	}

}
