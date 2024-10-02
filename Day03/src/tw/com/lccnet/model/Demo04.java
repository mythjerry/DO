package tw.com.lccnet.model;

public class Demo04 {

	public static void main(String[] args) {
		int a=100;
		float x=5.123456789F;
		
		System.out.println(a);
		System.out.println(x);
		//型態不相同需要進行強制轉型/自動轉型
		a=(int)x; //強制轉型
		System.out.println(a);
		x=a;//自動轉型
		System.out.println(x);

	}

}
