package lesson08_0913;
/*
 * java if命令文法:
 * if(條件)
 * 		//條件為Ture執行這一個-->一行
 * 											  -->{    多行必用    }
 * else
 *	    //條件為False執行這一個-->一行
 */

public class TestIf1 {

	public static void main(String[] args) {
		//複選
			int tree=3;
			if(tree==4)
				System.out.println("4");
			if(tree==3)
				System.out.println("對了");
			if(tree==2)
				System.out.println("2");
			
		//單選 都用單選
			int man=2;
			if(man==1)
				System.out.println("這是1");
			else if(man==2)
				System.out.println("對");
			else if(man==3)
				System.out.println("這是3");

	}

}
