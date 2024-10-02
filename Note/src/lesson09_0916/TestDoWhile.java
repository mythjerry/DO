package lesson09_0916;
/*
for及 while迴圈都是迴圈開始時做判斷要步要繼續執行,所以有可能完全不執行迴圈
do while迴圈是迴圈結束時判斷是否繼續執行,所以do while至少會執行一次
for迴圈往往用在明確次數
java for 迴圈有九種:
這裡八種
for(int i=1; i<10 ; i++)   |  for(       ; i<10 ; i++)   |   
for(int i=1; i<10 ;    )   |  for(       ; i<10 ;    )   |
for(int i=1;      ; i++)   |  for(       ;      ; i++)   | 
for(int i=1;      ;    )   |  for(       ;      ;    )   |
再加一個for each 共九種
while 文法:
  while(條件)
     //條件為真繼續執行這一個----->一行
                             ----->{多行}
     
do while文法:
  do
     //條件為真繼續執行這一個
     
  while(條件);
  
do-while循環的工作方式如下:
首先執行do塊內的代碼。
執行完do塊後,檢查while後面的條件。
如果條件為true,則回到第1步重複執行do塊。
如果條件為false,則結束循環,繼續執行循環後的代碼。
do-while循環的一個重要特點是,無論條件如何,do塊內的代碼至少會執行一次。
*/

/*
 * do-while循環適用於以下情況 :當您希望代碼塊至少執行一次時。
														當循環的終止條件取決於循環內部的操作時。
 */
public class TestDoWhile {
			public static void main(String[] args){
		        int i=1;
		        do {
		            int j=1;
		            do {
		                System.out.print((i*j>9?" ":"  ")+i*j);
		                ++j;
		            }while(j<10);
		            System.out.println();
		            ++i;
		        }while(i<10);
		    }
}
