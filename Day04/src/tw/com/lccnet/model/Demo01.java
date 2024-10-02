package tw.com.lccnet.model;

public class Demo01 {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		int c=5;
		
		System.out.println(a==b);  //T
		System.out.println(c != a); //T
		System.out.println(true && true); 
		System.out.println(a==b && c!=a); //T
		System.out.println(true && false);
		System.out.println(a==b && b!=a); //F
		String s="字串";
		int x=10;
		//當數值前後有字串會將後面數值轉換成String
		//先乘除後加減()內先計算
		System.out.println("字串"+(x+100));
		System.out.println(s+x+200);
	}

}
