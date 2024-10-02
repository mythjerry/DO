package tw.com.lccnet.model;

public class practice {

	public static void main(String[] args) {
		int [ ] arr = {1,2,3,4,5,6,7,8,9};
		int total=0;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]); //1 2 3 4 5 6 7 8 9
			total+=arr[i];
		}
		System.out.println("一維陣列累加:"+total); //一維陣列累加:45
		System.out.println("-----");
		int total1=0;
		int [ ] [ ] ary= {
				{1,2,3,4,5},
				{2,3,4,5,6},
				{3,4,5,6,7},
				{4,5,6,7,8},
				{5,6,7,8,9}};
		
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				System.out.println(ary[i][j]);
				total+=ary[i][j];
			}
			System.out.println(" ");
			System.out.println(total1);
			System.out.println(" ");
		}

	}

}
