package tw.com.lccnet.model;
//util 原廠的工具包
import java.util.Arrays;

public class Demo02 {
	static int [ ] arr= {10,34,5,23,56,80,100};
	public static void main(String[] args) {
		//原廠提供的排序
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		//method01();
		//printmethod();
	}
	public static void method01() {
		//進行排序
		for(int i=0; i<arr.length-1; i++) { //外層做比較
			for(int j=0; j<arr.length-1-i; j++) { //內層做交換
				if(arr[i] > arr[i+1]) {  //10,34會比較 34,5會比較 類推 但是100沒有對象比所以第6行程式碼for迴圈要改判斷"i<arr.length-1"
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void printmethod() {
		//進行列印
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
