package tw.com.lccnet.model;

public class Practice {

	public static void main(String[] args) {
		//外層
		for(int i=0; i<=100; i++) {
			//內圈
			if(i%10==0) {
				System.out.println(i);
				continue;
			}
		}
	}

	public static void method01() {
		// 外層
		for(int i=1; i<=2; i++) { //3.
			//內層
			for(int j=1; j<=4; j++) { //1.
				System.out.println(j);
			}
			System.out.println();//2.
		}
	}

}
