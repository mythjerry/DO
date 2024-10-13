package lesson05_0909;
/*
今天要講的是布林運算,布林運算是電腦基礎,有可用在邏輯條件及bit運算
布林運算有 4則                                   true, false                     1,0


*/
class TestBooleanOperator{
    public static void main(String[] args){
        System.out.println(5>6&9>2);//logic 邏輯運算 FALSE 
        int i=4;
        int j=12;
        System.out.println(i&j);//bit運算 4
        
        System.out.println(5>6|1>2);//logic FALSE
        int A=4;
        int B=8;
        System.out.println(A|B);//bit 12
        
        System.out.println(5>6^9>2);//logic
        int C=12;
        int D=8;
        System.out.println(C^D);//bit
        boolean batteryFullFlag=false;
        if(!batteryFullFlag){//!就是非
            System.out.println("電動車無法啟動!");
        }
     }
}
