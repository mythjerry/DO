package lesson09_0916;

public class Testdowhile1 {
	public static void main (String[] args) {
	    int i = 0, j = 0, k = 0;
	    do while (i++ < 3)
	      System.out.print(k++);
	    while (j++ < 3);
	  }
}
/*
i=0時 k印出0  ===>while(i++<3)條件成立
  i及k事後各加1
  i=1 k=1
i=1時 k印出1  ===>while(i++<3)條件成立
  i及k事後各加1
  i=2 k=2
i=2時 k印出2  ===>while(i++<3)條件成立
  i及k事後各加1
  i=3 k=3
i=3時 k不印     ===>while(i++<3)條件不成立

j在怎麼變 會被 內圈while(++i<3)擋住 k永遠不會印   
*/