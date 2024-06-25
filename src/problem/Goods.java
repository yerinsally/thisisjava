package problem;

public class Goods {
	
    private String name;
    private String price;
    private String num;
    
    //메소드 작성 : 생성자 만들기(Source > Generate Constructor using Fields)
    public Goods(String name, String price, String num) {
    	this.name = name;
    	this.price = price;
    	this.num = num;
    }
    //출력 메소드
    public void showInfo(){
        System.out.println(name+"(가격:"+price+"원)이 "+num+"개 입고되었습니다.");
    }
}
 