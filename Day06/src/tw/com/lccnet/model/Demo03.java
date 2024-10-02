package tw.com.lccnet.model;

public class Demo03 {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++ ) { //0~10 小至大
			System.out.println(i);
		}
		for(int j=10 ;j>=0 ; j--) { //10~0 大至小
			System.out.println(j);
		}

	}

	public static void method01() {
		// ++ +=2
		int a=0;
		int b=0;
		int c=10;
		int d=0;
		a+=1000; //a-=xxx a*=xxx a/=xxx
		System.out.println(a);
		b-=1000;
		System.out.println(b);
		c*=50;
		System.out.println(c);
		d/=50;
		System.out.println(d);
	}

}
