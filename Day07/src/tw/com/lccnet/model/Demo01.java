package tw.com.lccnet.model;

public class Demo01 {

	public static void main(String[] args) {
		/*
		 * byte[] arr = {2,3,4,5,6};
		 * Array　三種寫法
		 * 陣列運行後不能被修改
		 */
		//3.
		method03();
		method02();
		method01();
	}
	public static void method03() {
		short[] s= {10,20,30,40,50};
		printMethod(s);
	}
	//2.
	public static void method02() {
		short[] s=new short[] {5,3,7,12,9};
		printMethod(s);
	}
	//1.
	public static void method01() {
		short[] s=new short[5];
		s[0]=5;
		s[1]=3;
		s[2]=1;
		s[3]=10;
		s[4]=50;
		}
		
		public static void printMethod(short[] s) {
			for(int i=0; i<5; i++) {
				System.out.println(s[i]);
			}
		}
}
