package tw.com.lccnet.model;

public class Demo02 {

	public static void main(String[] args) {
		int i=0;//起始
		while(i<10) {//終點
			System.out.println("i:"+i);
			i+=2;//計算式
		}
	}

	public static void method02() {
		int i=0;//起始
		while(i<20) {//終點
			if(i%2==1) {
				System.out.println("i:" +i);
			}
			i++;
		}
	}

	public static void method01() {
		int i=0; //起始
		while(i<10) { //終點
			System.out.println("while" +i);
			i++; //計算式
		}
			System.out.println(i);
	}

}
