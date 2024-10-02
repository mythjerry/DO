package tw.com.lccnet.model;
//手機配備
public class Iphone {
		//手機數量
		private int num;
		//記憶體
		private String mey;
		//顏色
		private String color;
		
		//建構子
				public Iphone(int num,String mey,String color) {
					super();
					this.num = num;
					this.mey =mey;
					this.color =color;
				}
		
		//建構子
		public Iphone() {
			super();
		}
		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public String getMey() {
			return mey;
		}

		public void setMey(String mey) {
			this.mey = mey;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
		@Override
		public String toString() {
			return "Iphone [num=" + num + ", mey=" + mey + ", color=" + color + "]";
		}
}
