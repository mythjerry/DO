package lesson03_0903;

/*
在java原始碼中出現數字,沒小數點預設是int,有小數點預設是double
*/

class TestCasting1{
    public static void main(String[] args){
    	
        int i=3.0;
        System.out.println(i);
        
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