package lesson12_0923;
/*
物件導向:繼承,封裝,多形
物件基礎:缺了繼承
繼承code reuse
java 繼承是單一繼承
文法:
  class 子類別名 擴充 父類別名
  class 子類別名 extends 父類別名1
 "."句點用法:
 物件.成員
 物件.組成子物件.成員 
 a.b.c.d
 a.fun().d
*/

class SuperClass{
   String attr="parent member attribute ";
   void fun(){
       System.out.println("parent member method");
   }
}
class SubClass extends SuperClass{//code reuse
}

class TestInherit1{
   public static void main(String[] args){
       SubClass obj1=new SubClass();
       System.out.println(obj1.attr);
       obj1.fun();
   }
}
