package tw.com.lccnet.model;

import java.util.Spliterator.OfPrimitive;

public class Demo01 {

	public static void main(String[] args) {
		//for(int i=10; i>0; i--) { //顯示10~1
			//System.out.println(i);
			
			//巢狀迴圈
		for(int i=0; i<5; i+=2) {
			for(int j=0; j<5; j++) {
				System.out.println("for:"+i+"=="+j);
			}
		}
	}

	public static void methoderror() {
		for(int a=0; a<10; a++) {
			System.out.println("for:" +a);
		}
		System.out.println(a);  
		//a只作用在上面的for區塊內已經結束了，所以這行a讀不到，所以程式錯誤
		//while迴圈才讀的到，但寫法不同
	}

	public static void methodoq() {
		for(int i=1; i<50; i++) {
			if(i%4==0) {
				System.out.println("2:"+i);
			}else if(i%2==0) {
				System.out.println("4:"+i);
			}else if(i%10==0) {
				System.out.println("10:"+i);
			}
		}
	}

}
