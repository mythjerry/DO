package tw.com.lccnet.model;

public class Demo05 {

	public static void main(String[] args) {
		
		double a=5.123456789987654321;
		double b=0.123456789987654321;
		System.out.println(a);
		System.out.println(b);
		//由小轉大 OK
		float v=1.123456789f;
		double n=v;
		System.out.println(n);
		
		//由大轉小，須強制轉型
		v=(float)n;
		System.out.println(v);
	}

}
