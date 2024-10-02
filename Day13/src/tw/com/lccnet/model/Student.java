package tw.com.lccnet.model;

//繼承的父類別中有抽象方法，子類別需實作抽象方法
public class Student extends Person{
		
		@Override
		public void getAbs01() {
			System.out.println("抽象");
		}

		@Override
		public void getAbs02() {
			// TODO Auto-generated method stub
			
		}
	

}
