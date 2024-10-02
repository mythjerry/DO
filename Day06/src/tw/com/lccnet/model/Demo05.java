package tw.com.lccnet.model;

public class Demo05 {
//9x9乘法表
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9 ;j++) {
				System.out.printf("%d*%d=%d  \t",i ,j ,j*i );
			}
			System.out.println();
		}
		method01();
		method02();
	}

	public static void method01() {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9 ;j++) {
				System.out.println(j+"*"+i+"="+j*i+" ");
			}
		}
	}
	public static void method02() { //"巢狀迴圈"
			int a=30;
			if(a>0 && a<120) {
				if(a>5 && a<10) {
					System.out.println("5~10");
				}else if(a>=10 && a<20) {
					System.out.println("10~20");
				}else if(a>=20 && a<30) {
					System.out.println("20~30");
				}else if(a>=30 && a<40) {
					System.out.println("30~40");
				}
			}else {
				System.out.println("over 120");
			}
		
	}
			
}
