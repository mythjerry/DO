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
*/
public class TestFor {
	public static void main(String[] args){
		//method();
		//method01();  
		//method02();
    }

	public static void method() {
		for(int i=1;i<10;i++){		//這裡i的存活範圍只有在for迴圈內
            System.out.println("i="+i);
        	}
        //System.out.println("final value i="+i);//所以錯誤
		}
	public static void method01() {
		int i=1;
        for(;;){//等同while(True)無窮迴圈
            System.out.println(++i);
        }
	}
	public static void method02() {
		//無限迴圈
		for(int i=1;i<10;){
			System.out.println(i);
		}
	}
}
