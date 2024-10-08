package lesson04_0906;
/*
 * 運算子:
就是加減乘除等一類東西
++ 遞增 ++i ,i++ ==> i=i+1
-- 遞減 --i ,i-- ==> i=i-1

 A+B 中置
 +AB 前置
 AB+ 後置
*/

class TestInc{
    public static void main(String[] args){
        method01();
        method02();
    }

	public static void method02() {
		int i=5;
        System.out.println(i++);//先把 i 內容丟出 i再加一
        int j=7;
        System.out.println(++j);//先把i加 一 再丟出 i
	}

	public static void method01() {
		int i=5;
        i++;
        System.out.println(i);
        int j=7;
        ++j;
        System.out.println(j);
	}
}