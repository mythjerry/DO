package tw.com.lccnet.model;

public class Demo05 {

	public static void main(String[] args) {
		//相加為  + 128
		byte a=127;
		byte b=1;
		//加法OK 會放入電腦暫存區
		System.out.println(a+b);
		/*
		 * 錯誤問題
		 * 四則運算會把a跟b變數轉成預設值int
		 * 因為int記憶空間大於byte所以放不進去
		 * 因此需要強制轉型
		 */
		//byte c=a+b;
		
		byte c= (byte)(a+b);
		System.out.println(c);
		byte c1= (byte)(a-b);
		System.out.println(c1);
		byte c2= (byte)(a*b);
		System.out.println(c2);
		byte c3= (byte)(a/b);
		System.out.println(c3);
		

	}

}
