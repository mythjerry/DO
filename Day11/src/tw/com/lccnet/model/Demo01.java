package tw.com.lccnet.model;
/*項目(差異性)	外部			內部
 * private 			not			yes
 * static				not			yes
 * 建構子				yes  			yes
 * 方法					yes			yes
 */


//外部類別
public class Demo01 {
	//將內部類別設定為屬性
	
	//建構子
	public Demo01() {
		InClass ic=new InClass();
		ic.method01();
	}
	public void method() {
			System.out.println("-外部方法-");
	}
	//InClass getMethod01()=new InClass();
	public InClass getMethod01() {
		return new InClass();
	}
	
	
			
			//內部類別(一定會私有化)
			private  class InClass{
					
				public InClass() {
					
				}
				public void method01() {
					System.out.println("-內部方法-");
				}
				
			}
}	

