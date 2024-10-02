package lesson08_0913;

/*
java while命令文法:
    while(條件)
     //條件為真繼續執行這一個 ----> 一行 
                          ----> { 多行必用  }
請用while寫出9x9乘法表?
*/

public class TestWhile {
	public static void main(String[] args) { 
		int i=1;
		while(i<10) {
			System.out.print(i+" ");		
			i++;
		}
	}	
}
