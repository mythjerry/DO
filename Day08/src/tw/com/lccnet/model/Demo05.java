package tw.com.lccnet.model;

import org.junit.Test;

public class Demo05 {
			/*
			 * 1.無傳入，無回傳
			 *    進行列印，進行計算，方法呼叫等
			 *    常用(junit)
			 */
			@Test
			public void method01() {
				//System.out.println("無傳入，無回傳");
//				method02(666); //方法呼叫
//				method03(66,77);
//				int[] x= {10,20,30,40,50};
//				method03(x);
//				int y=method04();
//				System.out.println(y);
//				int [] g=method05();
//				for(int i=0; i<g.length;i++) {
//					System.out.println(g[i]);
//				}
				
//				int u =method06(200,200);
//				System.out.println(u);
				//int[] x= {10,20,30,40,50};
				method07(10,20,30,50,70,100);
				
			}		
			/*
			 * 5:可變參數
			 *    可變長度的陣列，一般陣列是不可改變長度的
			 *    超過一個傳入值不可放置可變參數後面，要放置於前面
			 */
			
			public void method07(int ... f) { //無限迴圈
				for(int i=0; i<f.length; i++) {
					System.out.println(f[i]);
				}
			}
			
			public void method08(char v,int ... f) {
				for(int i=0; i<f.length; i++) {
					System.out.println(f[i]);
				}
			}

			
			/*
			 * 4.有傳入，有回傳
			 */
			public int method06(int a,int b) {
					int c=1000;
					return a+b+c;
			}
			
			/*
			 * 3.無傳入，有回傳
			 * 	   回傳一個型態
			 */
			public int[] method05() {
					int[] f= {10,20,30,40,50};
					return f;
			}
			public int method04() {
				return 100;
			}
			/*
			 * 2.有傳入，無回傳
			 * 可以傳入多個變數，陣列
			 */					
			public void method02(int a) {
				System.out.println("有傳入，無回傳"+a);
			}
			public void method03(int a,int b) {
				System.out.println("有傳入，無回傳"+(a+b));
			}
			public void method03(int [] a) {
				int sum=0;
				for(int i=0; i<a.length; i++) {
					sum+=a[i];
				}
				System.out.println(sum);
			}
}
