package lesson12_0923;
/*
方法改寫有兩種:
overload 過載 同名異式 定義 方法名稱一樣 ,方法簽名(參數列)不同
override 覆寫 子類別改寫父類別同方法簽名的方法
*/
class SuperClass{
   String attr="parent member attribute ";
   void fun(){
       System.out.println("parent member method args zero");
   }
   void fun(int i){//overload
       System.out.println("parent member method args int");
   }
}
class SubClass extends SuperClass{//code reuse
   void fun(){//override
       System.out.println("child override member method args zero");
   }
}

class TestInherit2{
   public static void main(String[] args){
       SubClass obj1=new SubClass();
       System.out.println(obj1.attr);
       obj1.fun();
   }
}
