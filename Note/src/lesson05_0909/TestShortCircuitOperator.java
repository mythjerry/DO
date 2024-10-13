package lesson05_0909;

class TestShortCircuitOperator{
    public static void main(String[] args){
        int i=5;
        int j=7;
        if(++i>6&++j>5){
            //don't care here
        }
        System.out.println(i);//6
        System.out.println(j);//8
    }
}

/*
&&稱為短路運算子,只能用在邏輯條件運算,不能用在bit運算

& 可同時用在邏輯條件運算及bit運算

*/
