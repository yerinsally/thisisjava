package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {
    public static void main(String[] args) {
    	
		//ArrayList 컬렉션 생성 : 제네릭
    	List<Goods> goodsArray = new ArrayList<>();
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("상품 3개를 입력해주세요");
        
        //객체 추가
        int num = 0;
        for(int i=0; i<3; i++) {
        	String[] str = sc.nextLine().split(" ");
        	goodsArray.add(new Goods(str[0], str[1], str[2]));
        	num += Integer.parseInt(str[2]);
        }
        System.out.println();	
      	
      	//모든 객체를 하나씩 가져오기
      	for(Goods g : goodsArray) {
			g.showInfo();;
		}
      	System.out.println("모든 상품의 개수는 "+num+"개입니다.");
      	
        sc.close();
    }
}
