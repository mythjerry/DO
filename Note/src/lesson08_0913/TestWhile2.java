package lesson08_0913;
//雙層while
//排序1~9 9x9行列

class TestWhile2{
    public static void main(String[] args){
        int i=1;
        while(i<10){
          int j=1;
          while(j<10){
              System.out.print(" "+j);
              j++;
          }
          System.out.println();
          i++;
        }  
    }
}