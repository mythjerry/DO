package lesson04_0906;

class TestOperator{
	public static void main(String[] args){
		int i=5;
		int j=5;
		System.out.println(++i);
		System.out.println(j++);
		System.out.println("===============================1");
        /*
            ++i
              (1).先本身加一(2).再給值丟出
            i++
              (1).先給值丟出 (2).事後再本身加一  
        */

		i=5;
		j=5;
		System.out.println(i+++j);  // i++ +j      10 ===> i先丟出 5與j相加  後i
		System.out.println(i);//6
		System.out.println(j);//5
		System.out.println("===============================2");
        
		i=5;
		j=5;
		System.out.println(i++ +j);//10
		System.out.println(i);//6
		System.out.println(j);//5
		System.out.println("===============================3");

		i=5;
		j=5;
		System.out.println(i+ ++j);//11
		System.out.println(i);//5
		System.out.println(j);//6       
        System.out.println("===============================4");
        
		i=5;
		j=5;                
        System.out.println(i+++ ++j);
		System.out.println(i);
		System.out.println(j);
		System.out.println("===============================5");
        /*
          i+++++j 會被電腦解意成 i++ ++ +j 三段  第一段 i++ 結果是一個值不是變數 ,是不能再被 後++
          有就是 ++ -- 只能對變數內容加減一,但值就是值不能再加減一,  
        */
        /*
          ++i合法
          ++5 不合法
          請問++i或i++後回傳是何物?是值 
        */
        i=5;
		j=5;
        System.out.println(i+++j++);//10
		System.out.println(i);//6
		System.out.println(j);//6
		System.out.println("===============================6");
        i=1;
		i=i++;
        /*
            i++  
            ->v=i
              v++
         i=1
         v=i
         i=v++     
        */
        
		System.out.println(i);
		System.out.println("===============================7");
		i=1;
		j=i-- + ++i;
        /*
         j=i-- + ++i
           i--=0
           v0=i
           v0-- 
                 ++i
                 v1=i
                 ++v1->2
        
        */
		System.out.println(i);
		System.out.println(j);
		System.out.println("===============================8");

		i=1;
		j=i-- + ++i+i-- + ++i;
		System.out.println(i);
		System.out.println(j);
		System.out.println("===============================9");

		i=1;
		j=1;		
		int k=i-- + ++j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println("===============================10");
	}
}
