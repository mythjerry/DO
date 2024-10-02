package lesson12_0923;

class SuperClass{
    SuperClass(){
        System.out.println("父類別建構式");
    }
}
class SubClass extends SuperClass{
    SubClass(){
        System.out.println("子類別建構式");
    }
}

class TestInherit3{
    public static void main(String[] args){
        new SubClass();
        new SubClass();
        new SubClass();
    }
}
