package lesson08_0913;
/*
 * java final 命令:
 * final用在變數則這變數稱為一次性設定變數
 */

class TestVar9{
    public static void main(String[] args){
    	final int a; //成立
        final int x=5;
        int y;
        if(x>4){
            y=6;
        }
        System.out.println(y);
        /*
         * 不會過，因為X是可變動的數值
         * 要過需加上final :final int x=5;
         * 
         */
    }
}

