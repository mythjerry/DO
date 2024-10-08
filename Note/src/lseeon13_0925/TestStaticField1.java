package lseeon13_0925;

class peo{
    static int count=0;
    peo(){
        ++count;
    }
}
class TestStaticField1{
    public static void main(String[] args){
        peo h1=new peo();
        peo h2=new peo();
        peo h3=new peo();
        peo h4=new peo();
        peo h5=new peo();
        System.out.println(h1.count);
    }
}