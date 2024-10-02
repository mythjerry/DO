package lesson08_0913;

public class TestLoop {
	/*
	  迴圈 loop sudo code:
	  
	     loop(條件)
	     //條件為真繼續做這一個----> 一行 
	                             ----> { 多行必用  }
	    java 迴圈分三大類:
	    for
	    while
	    do while
	    請問java for迴圈有幾種? 9 種                         
	    java for迴圈文法
	  
	  	for(迴圈初始 ; 迴圈判斷 ; 迴圈增量)
	    迴圈初始:for迴圈開始時執行一次
	    迴圈判斷:for迴圈重頭來時做條件判斷是否執行
	    迴圈增量:for迴圈每次結束時執行
	 	for(int j=1;j<10;++j)   
	 
	*/
		public static void main(String[] args) {
	        for(int j=1;j<10;j++){
	            System.out.print(" "+j);
	            //println印完會跳下一行,print則是接著印同一行
	        }
	        method01();
	    }
		public static void method01() {
			for(int i=1;i<10;i++){
		          for(int j=1;j<10;j++){
		              System.out.print(" "+j);
		           //println印完會跳下一行,print則是接著印同一行
		          }
		          System.out.println();
		        }
		}
}