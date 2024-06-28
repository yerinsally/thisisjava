package ch18.sec10;

import java.io.Serializable;

public class Product implements Serializable {	//비어있는 인터페이스 : 타입이 같은지 instanceOf로 확인하는 용도
	private static final long serialVersionUID = -621812868470078544L;
	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() { return name + ": " + price; }
}



