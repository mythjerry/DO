package lesson08_0913;
/*
java while命令文法:
    while(條件)
     //條件為真繼續執行這一個 ----> 一行 
                          ----> { 多行必用  }
請用while寫出9x9乘法表?
*/
class TestWhile9x9{
  public static void main(String[] args){
	  int i=1;
      while(i<10){
        int j=1;
        while(j<10){
            System.out.print((i*j>9?" ":"  ")+i*j);
            j++;
        }
        System.out.println();
        i++;
      }  
      //method9x9_1();  
  }

public static void method9x9_1() {
	int i=1;
      while(i<10){
        int j=1;
        while(j<10){
            System.out.print(" "+i*j);
            j++;
        }
        System.out.println();
        i++;
      }
}
}