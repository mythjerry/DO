package lesson09_0916;

public class Testdowhile2 {
	public static void main (String[] args) {
	    int i = 0, j = 0;
	    while (i++ < 3){
	       do{
	        System.out.print(j);
	      }while (j++ < 3);
	    }
	  }
}
/*
012345
while i=0
  do while
   p j=0
   if j0 j++ pj=1
   if j1 j++ pj=2
   if j2 j++ pj=3
      j不小於3 do while 終止但j++變4
while i=1
   do  while 
       pj=4
       j不小於3 do while 終止但j++變5       
while i=2
   do  while 
       pj=5
       j不小於3 do while 終止但j++變6
while 終止              
*/