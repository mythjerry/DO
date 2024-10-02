package tw.com.lccnet.model;

public class Demo2 {

	public static void main(String[] args) {
		// ln 跳下一行在列印
		System.out.println("Hello");
		System.out.print("World");
		//
		System.out.println("Hello \" world "); //輸出"雙引號
		System.out.println("H+ello \' world"); //輸出'單引號
		System.out.println("H+ello \\ world");//輸出\斜線
		System.out.println("Hello\nworld"); // \n 換到下一行 
		System.out.println("Hello\tworld"); //輸出一個tab 鍵 空四格
	}

}
