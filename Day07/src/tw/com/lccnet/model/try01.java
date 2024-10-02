package tw.com.lccnet.model;

public class try01 {
	public int sum(int... numbers) {
	    int total = 0;
	    for (int num : numbers) {
	        total += num;
	    }
	    return total;
	}
	int result1 = sum(1, 2, 3);        // 返回 6
	int result2 = sum(1, 2, 3, 4, 5);  // 返回 15
	public void print(Object obj) {
	    System.out.println("Object: " + obj);
	}

	public void print(String s) {
	    System.out.println("String: " + s);
	}
}
