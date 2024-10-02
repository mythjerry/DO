package tw.com.lccnet.model;

import javax.security.auth.x500.X500Principal;

public class Demo03 {

	public static void main(String[] args) {
		int [ ][ ] x= {
				{1,2,3,4,5}, //[I@3d012ddd
				{6,7,8,9,10}, //[I@626b2d4a
				{11,12,13,14,15}, //[I@5e91993f
				{16,17,18,19,20} }; //[I@1c4af82c
				System.out.println(x.length); //4
		
		//外圈		
		for(int i=0; i<x.length; i++) {
			//System.out.print(x[i]); //[I@515f550a[I@626b2d4a[I@5e91993f[I@1c4af82c
			System.out.println(x[i].length);  //4 5 5 5 5
			//內圈
			for(int j=0; j<x[i].length; j++) {
				System.out.print(x[i][j]); //印出陣列內容
			}
				System.out.println();
	
		}
	}

}
