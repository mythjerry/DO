package lesson03_0903;
/*
java char 字元型態:
java 字元是走uni-code標準 16bit
字元是用單引號' '隔起來,只能一個字
字串是用雙引號" "隔起來
而ASCII向上相容UNI-CODE
48 '0'  十六進位= '30'
65 'A'  
97 'a'
跳脫字元就是讓後面跟者的字元失去原來的用意
/u是uni-code
/n 跳行
/r 游標跳至行首
/t 跳格定位鍵
*/

class TestChar{
    public static void main(String[] args){
        char c0='\u0030';// \U是跳脫字元,代表後面跟著十六bit的十六進位編碼
        char c1='\u0031';
        char c2='\u0041';
        char c3='\u0042';
        System.out.println(c0);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("=========\n=============");
        char c4='0';
        char c5='1';
        char c6='A';
        char c7='B';
        char c8='\'';
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println("======================");
        
        char a='a';
        char b='b';
        char c='c';
        char d='d';
        System.out.println(a+b+c+d);//97+98+99+100
        System.out.println(a+b+c+""+d);//97+98+99=294d
        System.out.println(a+b+""+c+d);//97+98=195cd
        System.out.println(a+""+b+c+d);//'a'+"bcd"
        System.out.println(""+a+b+c+d);//"abcd"
        /*
        1.JAVA 單一char當char
        2.char 與任何數值做運算當數值
        3.在java程式碼中與字串相接,當字串
       */
    }
}
