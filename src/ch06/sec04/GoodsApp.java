package ch06.sec04;

public class GoodsApp {
	public static void main(String[] args) {
	Goods good  = new Goods();
	
	// 값 세팅
	good.name = "nikon";
	good.price = 4000000;
	
	//출력
	System.out.println("상품 이름 : " + good.name);
	System.out.println("상품 가격 : " + good.price);
	}
}
