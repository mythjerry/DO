package lesson04_0906;

/*
右移又分:
   有號右移 >>
   無號右移 >>>
電腦沒有減法器 3-3 ==>   3+ -3
請問在這 -3如何得來
電腦使用補數來取的 -3
1's 1補數
2's 2補數
 1's就是 0<--->1     值域  -127~-0  +0~+127
 2's就是 1's+1       值域  -128~+127
*/

class TestBitShiftA{
    public static void main(String[] args){
        int i=8;
        int j=8;
        System.out.println(i>>1);
        System.out.println(j>>>1);
        int k=-8;
        int l=-8;
        System.out.println(k>>1);
        System.out.println(l>>>1);
    }
}
