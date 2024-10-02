package tw.com.lccnet.model;

public class Demo04 {

	public static void main(String[] args) {
		//do while 不管判斷條件是否成立，一定會運行一次
		int a=1;
		do {
			System.out.println(a);
			a+=3;
		} while (a<10);
		
		System.out.println("-do while-");
		
		int b=0;
		do {
			System.out.println(b);
			b++;
		}while(b<10);
		
		System.out.println("-do while-");
		
		int c=1;
		while(c<6) {
			System.out.println(c);
			c++;
		}
		System.out.println("-----");
	}
	

}
