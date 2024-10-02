package tw.com.lccnet.model;

import java.lang.reflect.AnnotatedArrayType;

public class Demo04 {

		public static void main(String args[]) {
			int [ ] arr= {100,500,34,58,12,8};
				methodmax(arr);
				methodmin(arr);
				int sum = methodsum(arr);
				methodavg(arr, sum);
				methodcopy(arr);
				System.out.println("--array反轉--");
				
				for(int i=0; i<arr.length/2; i++) {
					int temp=arr[i];
					arr[i]=arr[arr.length-1-i];
					arr[arr.length-1-i]=temp;
				}
				for(int i=0; i<arr.length; i++) {
					System.out.println(arr[i]);
				}
		}

		public static void methodcopy(int[] arr) {
			System.out.println("--陣列複製--");
			//Array陣列
			int [ ] arr1=new int[arr.length];
			for(int i=0; i<arr.length;i++) {
				arr1[i]=arr[i];
				System.out.println(arr[i]);
			}
		}

		public static void methodavg(int[] arr, int sum) {
			System.out.println("-平均值-");
			//平均值
			int avg;
			avg=sum/arr.length;
			System.out.println(avg);
		}

		public static int methodsum(int[] arr) {
			System.out.println("--陣列累加值--");
			//取得陣列累加
			int sum=0;
			for(int i=0; i<arr.length; i++) {
				sum+=arr[i];
			}
			System.out.println(sum);
			return sum;
		}

		public static void methodmin(int[] arr) {
			System.out.println("--取得陣列最小值--");
			//最小值
			int min=arr[0];
			for(int j=0; j<arr.length; j++) {
				if(min>arr[j]) {
					min=arr[j];
				}
			}
			System.out.println(min);
		}

		public static void methodmax(int[] arr) {
			System.out.println("--取得陣列最大值--");
			//取得陣列最大值
			int max=arr[0];
			for(int i=1; i<arr.length; i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}		
			System.out.println(max);
		}
}
