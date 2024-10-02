package tw.com.lccnet.model.bean;

//一本書的結構

public class Book {
		private String bookName;	//書名
		private Long bookPrice;		//價錢
		private String bookNumber;		//書號
		private Boolean bookIn_out;		//	是否在庫
		
		
		//建立空參數建構子
		public Book() {
			super();			
		}

		//使用建構子輸入
		public Book(String bookName, Long bookPrice, String bookNumber, Boolean bookIn_out) {
			super();
			this.bookName = bookName;
			this.bookPrice = bookPrice;
			this.bookNumber = bookNumber;
			this.bookIn_out = bookIn_out;
		}
		
		

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public Long getBookPrice() {
			return bookPrice;
		}

		public void setBookPrice(Long bookPrice) {
			this.bookPrice = bookPrice;
		}

		public String getBookNumber() {
			return bookNumber;
		}

		public void setBookNumber(String bookNumber) {
			this.bookNumber = bookNumber;
		}

		public Boolean getBookIn_out() {
			return bookIn_out;
		}

		public void setBookIn_out(Boolean bookIn_out) {
			this.bookIn_out = bookIn_out;
		}

		@Override
		public String toString() {
			return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookNumber=" + bookNumber
					+ ", bookIn_out=" + bookIn_out + "]";
		}
		
		
}
