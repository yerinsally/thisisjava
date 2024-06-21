package ch06.problem;

public class Book {
	public int bookNo;
	public String title;
	public String author;
	public int stateCode = 1;

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	public void rent(int stateCode) {
		this.stateCode = stateCode;
	}
	
	String str;
	public void print() {
		if(stateCode == 1) {
			str = "대여가능";
		}else if(stateCode == 0) {
			str = "대여중";
		}
		//삼항연산자 str += "대여 유무 : " + ((stateCode == 1) ? "재고 있음" : "대여중");
		System.out.println(bookNo + " 제목: " + title + ", 저자: " + author + ", 대여유무: " + str);
	}
}
