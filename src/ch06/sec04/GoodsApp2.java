package ch06.sec04;

public class GoodsApp2 {
	public static void main(String[] args) {
	Goods good1  = new Goods();
	Goods good2  = new Goods();
	
	// 값 세팅
	good1.name = "LG그램";
	good1.price = 9000000;
	good2.name = "머그컵";
	good2.price = 2000;
	
	//출력
	System.out.println("상품 이름 : " + good1.name);
	System.out.println("상품 가격 : " + good1.price);
	System.out.println("상품 이름 : " + good2.name);
	System.out.println("상품 가격 : " + good2.price);
	}
}
