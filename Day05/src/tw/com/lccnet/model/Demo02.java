package tw.com.lccnet.model;
//三元運算式
public class Demo02 {

	public static void main(String[] args) {
		String val=method03();
		System.out.println(val);
	}
	private static String method03() {
		return 10>5?"true":"false";
	}
	private static void method02(int a) {
		System.out.println(a>5? "結果成立":"結果不成立");
	}

	public static void method01() {
		System.out.println(10!=10?"這是真的":"這是假的");
		System.out.println(10>5? "true":"false");
	}
}
