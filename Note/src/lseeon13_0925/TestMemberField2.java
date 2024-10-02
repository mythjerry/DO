package lseeon13_0925;

class 人{
    int count=0;
    人(){
        ++count;
    }
}
class TestMemberField2{
    public static void main(String[] args){
        人 h1=new 人();
        人 h2=new 人();
        人 h3=new 人();
        人 h4=new 人();
        人 h5=new 人();
        System.out.println(h1.count);
    }
}
