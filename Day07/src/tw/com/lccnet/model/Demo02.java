package tw.com.lccnet.model;

public class Demo02 {

	public static void main(String[] args) {
		int [] x= {1,2,3,4} ;
		System.out.println(x); //[I@3d012ddd 記憶體位置
		int [] y= {4,3,2,1};
		System.out.println(y); //[I@626b2d4a
		System.out.println(y=x); //[I@3d012ddd
		//x值給y值 但是記憶體位置沒有變
		//陣列指向改變，並未改變原陣列的記憶體位置 
		System.out.println(x); //[I@3d012ddd
		System.out.println(y); ////[I@3d012ddd
		
		int a=5;
		int b=10;
		System.out.println(b=a);
		System.out.println(a);
		System.out.println(b);
	}

}
