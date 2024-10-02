package lesson12_0923;

public class TestArray {
	public static void main(String[] args){
        final int[] array={1,2,3,4,5,6,7,8,9};
        for(int v: array){
            System.out.print(" "+v);
        }
        System.out.println("\n=================");
        array[4]=99;//合法
        for(int v: array){
            System.out.print(" "+v);
        }
        //array=new int[10];//error不合法
    }
}
