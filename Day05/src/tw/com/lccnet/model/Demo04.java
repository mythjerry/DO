package tw.com.lccnet.model;

public class Demo04 {

	public static void main(String[] args) {
		/*
		 * a++ 後加
		 * ++a 先加
		 * 
		 * int a=10;
		 * a=a+1
		 * 
		 * 10=10+1 先加 1步完成
		 * 10=11
		 * 11
		 */
		
		
		/*
		 * 10=10+1  後加 
		 * 10=+1 1步
		 * 10+1= 2步
		 * 11
		 */
		int a=10; //後加
		System.out.println(a--); 	
		System.out.println(a);
		int b=10;//先加
		System.out.println(--b);

	}

	public static void method01() {
		int a=10; //後加
		System.out.println(a++); 	//a=a+1 	//11
		System.out.println(a);
		int b=10;//先加
		System.out.println(++b);
	}

}
