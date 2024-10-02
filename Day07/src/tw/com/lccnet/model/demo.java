package tw.com.lccnet.model;

public class demo {
	public static void main(String args[]) {
		int [] x={1,2,3,4,5,6};
		int sum=0;
		for(int i=0; i<x.length; i++) {
			sum+=x[i];
		}
		System.out.println(sum); //21
	}
}