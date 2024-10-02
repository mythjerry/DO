package lesson09_0916;

/*
java 處理字串有三個 class:

   String class
   StringBuffer class (多工)
   StringBuilder class(java 5.0出現)(單工)
*/

public class TestAppendString {
	public static void main(String[] args) {
        String text = "";

        // 記錄起始時間
        long beginTime =System.currentTimeMillis();
        // 使用 + 運算子附加字串 
        for(int i = 0; i < 100000; i++) {
            text = text + i;
        }
        // 記錄結束時間
        long endTime =System.currentTimeMillis();

        System.out.println("執行時間：" + (endTime - beginTime));

        StringBuilder builder = new StringBuilder("");

        // 記錄起始時間
        beginTime = System.currentTimeMillis();
        // 使用StringBuilder附加字串
        for(int i = 0; i < 100000; i++) {
            builder.append(String.valueOf(i));
        }
        // 記錄結束時間
        endTime = System.currentTimeMillis();

        System.out.println("執行時間：" + (endTime - beginTime));
    }
}
