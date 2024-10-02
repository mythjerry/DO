package tw.com.lccnet.model;

public class Demo07 {

	public static void main(String[] args) {
		int y=method01();
		System.out.println(y);
}

	public static int method01() {
		int a=2;
		switch(a) {
		case 1:
			//System.out.println("1");
			return 1;
		case 2:
			//System.out.println("2");
			return 2;
		case 3:
			//System.out.println("3");
			return 3;
		}
		return 0;
	}
}

