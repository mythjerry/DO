package lesson2_0830;

/*
java 變數是強制型別:(java變數一經宣告在存活期間,不能再改變型態)
    1.宣告型態  2.初始化  3.使用
java 變數型態有九種
  七種數值
  一種布林(真true假false值)
  一種參考
*/
class Var{
	//v=123; 2.初始化
	//由於沒有進行1.宣告型態 就直接初始化，所以錯誤
}


class TestVar1{
    public static void main(String[] args){
        //a=123;//error
        int b=123;//這裡宣告變數名為b，型態是32bit int 給入初始值123
        
        int c=1234567890;
        System.out.println(c);
        float d=c;
        System.out.println(c);
        
        char c1='A';
        //short s1=c1;//error
        
        int i=0b101;//二進位 5
        int j=0101;//八進位  65 
        int k=101;//10進位   101
        int l=0x101;//16進位 257
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        /*
        在java中出現數字分辨進制
         1. 數字前出現0代表非十進制
         2.  0b數字b代表binary二進位
         3. 單純0開頭數字沒有b或x代表八進位
         4 0x數字 x代表Hex十六進位
         
         bit 位元,就是一個空格,只放電腦,二進位,0跟1 
        */
        
        byte b1=5;
        byte b2=6;
        byte b3=(byte)(b1+b2);
        /*
        小於int型態整數,先轉int再運算
        一大一小空間做運算,小的先轉大的再運算,結果就是大的空間        
         強迫轉型 大轉小 casting 文法:
         (小的型態) 大的值  ------>小的值         
       */
        //float f=3.0; //error 
        float f=(float)3.0;    
        float f1=3.0F;    
    }

}
