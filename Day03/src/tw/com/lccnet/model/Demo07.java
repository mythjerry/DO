package tw.com.lccnet.model;

public class Demo07 {

	public static void main(String[] args) {
		//字母
		char a='A';
		char b='中'; //2個byte
		System.out.println(a);
		System.out.println(b);
		
		char c=88; //ASCII碼  使用數字表示字母
		System.out.println(c);
		//2進位:0100 0001 10進位:65 16進位:41 結果=A
	}
}
