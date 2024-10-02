package tw.com.lccnet.model;

public class Demo03 {

	public static void main(String[] args) {
			//型態 變數名稱=初始化值
		byte b1=-128; //變數(可變之數)
		System.out.println(b1);
		//byte b1=20; 不同變數，但變數名稱在同一個class中方法不能重複
		b1=20;//重新賦值
		System.out.println(b1);
		
		byte s1=10;
		byte s2=20;
		//計算s1+s2 存放在temp區，temp區記憶體限制
		System.out.println(s1+s2);
		System.out.println("byte計算有問題，因為預設值的問題");
		/*
		 * 1.先乘除後加減，括弧內先計算(int)
		 * 計算後結果強轉回byte
		 */
		byte total=(byte)(s1+s2);
		//s1+s2會因為計算將原本byte轉換成int
		System.out.println(total);
	}

	public static void method01() {
		//數字 %d
		System.out.printf("%d\n",123456);
		//字串 %s
		System.out.printf("%s\n","字串");
		//字母 %c
		System.out.printf("%c\n",'A');
		//浮點數 %f
		System.out.printf("%f\n", 123.456);
		//浮點數限制小數點後的個數(點後取2個)
		System.out.printf("%.2f\n",123.56789);
		//文字 數字 文字
		System.out.printf("%s%d%s\n","價錢:",35000,"元");
	}

}
/*
 * float小數點6個 double小數點12個
 */
