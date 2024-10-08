package lesson04_0906;
/*
左移乘2
右移除2
int 空間 32bit 
java 位移 :
1.第一種傳統方式 每次位移一次,位移97次因超出格子,就變0
2.第二種位移就一次位移超出32bit,則以一次位移總次數除以32的餘數位移
*/
class TestBitShift1{
    public static void main(String[] args){
        method01();
        method02();
    }

	public static void method02() {
		int i=8;
        System.out.println(i>>97);
        int j=4;
        System.out.println(j<<97);
        int k=8;
        for(int v=0;v<97;v++){
            k=k<<1;
        }
        System.out.println(k);
	}

	public static void method01() {
		int i=8;
        System.out.println(i>>1);
        int j=4;
        System.out.println(j<<1);
	}
}
