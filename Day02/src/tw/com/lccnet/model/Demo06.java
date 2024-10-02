package tw.com.lccnet.model;

public class Demo06 {

	public static void main(String[] args) {
	
				short a=127;
				short b=127;
				//加法OK 會放入電腦暫存區
				System.out.println(a+b);
				/*
				 * 錯誤問題
				 * 四則運算會把a跟b變數轉成預設值int
				 * 因為int記憶空間大於byte所以放不進去
				 * 因此需要強制轉型
				 */
				//byte c=a+b;
				
				short c= (short)(a+b);
				System.out.println(c);
				short c1= (short)(a-b);
				System.out.println(c1);
				short c2= (short)(a*b);
				System.out.println(c2);
				short c3= (short)(a/b);
				System.out.println(c3);

	}

}
