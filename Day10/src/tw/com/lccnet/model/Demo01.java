package tw.com.lccnet.model;
/*
 * 方法與建構子多載
 * 1.名稱相同，傳入個數不相同
 * 2.名稱相同，傳入型態不相同
 * 3.名稱相同，傳入位置不相同
 */

public class Demo01 {
		//建構子多載
		public Demo01() {
			
		}
		public Demo01(int x) {
			
		}
		//方法多載
		public void method01() {
			
		}
		public void method01(int a) {
			
		}
		public void method01(int a,char c) { //名稱相同，傳入型態不相同
			
		}
		public void method01(char c,int a) { //名稱相同，傳入位置不相同
			
		}
}
