package lesson08_0913;

/*
java switch 文法:
 switch (變數){
    case 條列值:
        //do something
        [break;]
    [default: 不在條列值內的例外選項]
 }
ps: switch 變數及條列值只能接受 byte,short,char,int,String,  <Enum(java 5.0版前不接受 String,Enum)型態>
					(long無法使用)
    	""條列值只接受明確值不接受變數""             
*/

public class TestSwitch {

	public static void main(String[] args) {
		 int degree=3;
	        switch(degree){
	        case 4:
	          System.out.println("大學四年級");
	          break;
	        case 3:
	          System.out.println("大學三年級");
	          break;
	        case 2:
	          System.out.println("大學二年級");
	          break;
	        case 1:
	          System.out.println("大學一年級");
	          break;
	        }
	        //印出結果:大學三年級
	        
			//method01();
	}

	public static void method01() {
		int degree=3;
		switch(degree){
		case 4:
		  System.out.println("大學四年級");
		case 3:
		  System.out.println("大學三年級");
		case 2:
		  System.out.println("大學二年級");
		case 1:
		  System.out.println("大學一年級");
		}
		//印出結果:大學三年級
		//				   :大學二年級
		//				   :大學一年級
	}

}
