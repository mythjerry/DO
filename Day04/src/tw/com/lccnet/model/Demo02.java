package tw.com.lccnet.model;

public class Demo02 {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		int c=5;
		
		System.out.println(a==b);  //T
		System.out.println(c != a); //T
		System.out.println(true || true); //T
		System.out.println(a == b || c!= a); //T
		System.out.println(true || false);//T
		System.out.println(a == b || b != a); //T
		
	}

}
