package tw.com.lccnet.model;

public class Demo01 {
		static char[] charArray= {'a','b','c','d','e'};
		public static void main(String[] args) {
				//Array copy
				char[ ] char1= new char[charArray.length]; 
				for(int i=0; i<charArray.length; i++) {
					char1[i]=charArray[i];
					System.out.println(char1[i]);
				}

	}

}
