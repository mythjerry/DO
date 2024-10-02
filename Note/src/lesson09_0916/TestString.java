package lesson09_0916;
/*
java ""隔起來的預設是String class型態 ,會放入String pool重複使用
String class 字串常數物件 ,運算一律產生一個新的給你
"select * from customer"
*/
public class TestString {
	public static void main(String[] args){
        String str1="Hello World!";
        String str2="Hello World!";
        String str3=new String("Hello World!");///new就是不管三七 二十一 ,一律重建
        String str4="Hello";
        str4=str4+" World!";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("=======================");
        if(str1==str2){
            System.out.println("str1==str2");//run here
        }else{
            System.out.println("str1!=str2");
        }
        if(str1==str3){
            System.out.println("str1==str3");
        }else{
            System.out.println("str1!=str3");//run here
        }
        if(str1==str4){
            System.out.println("str1==str4");
        }else{
            System.out.println("str1!=str4");//run here
        }
    }
}
