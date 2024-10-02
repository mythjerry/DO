package lesson08_0913;

//java 三元運算子文法: 條件 ? 條件為真給的值 :   條件為假給的值
//

public class For9x9{
	    public static void main(String[] args){
	    	
	        for(int i=1;i<10;i++){
	          for(int j=1;j<10;j++){
	              System.out.print((i*j>9?" ":"  ")+i*j);
	          }
	          System.out.println();
	        }
	        
	        method01();
	    }
	    public static void method01() {
	    	for(int i=1;i<10;i++){
	            for(int j=1;j<10;j++){
	              if(i*j>9) //把印出的結果整理 排版對齊 
	                System.out.print(" "+i*j);//相乘之後大於9，空1格
	              else 
	                System.out.print("  "+i*j+" "); //相乘之後小於9，空2格
	            }
	            System.out.println();
	          }
	    }
}
