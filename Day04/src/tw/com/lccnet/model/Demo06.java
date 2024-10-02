package tw.com.lccnet.model;

import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		//標準輸入(鍵盤輸入，輸出終端機中)
		Scanner keyin=new Scanner(System.in);
		System.out.println("請輸入你得年紀");
		//String name=keyin.next();
		int age=keyin.nextInt();
		
		// if 巢狀
		if(age>0 && age<120) {
			
				if(age>0 && age<6) {
					System.out.println("幼兒");
				}else if(age>=6 && age <=12) {
					System.out.println("國小");
				}else if(age>=12 && age <18) {
					System.out.println("國高中");
				}else if(age>=18 && age <23) {
					System.out.println("大學");
				}else  {
					System.out.println("社會人");
				}
		}
		else {
			System.out.println("不成立");
		}
	}

}
