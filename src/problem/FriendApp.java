package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {
    public static void main(String[] args) {
    	
		//ArrayList 컬렉션 생성 : 제네릭
    	List<Friend> friendArray = new ArrayList<>();
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("친구를 3명 등록해 주세요");
        
        //객체 추가
        for(int i=0; i<3; i++) {
        	String[] str = sc.nextLine().split(" ");
        	friendArray.add(new Friend(str[0], str[1], str[2]));
        }
        System.out.println();
        
        //저장된 총 객체 수 얻기
      	int size = friendArray.size();
      	System.out.println("총 객체수: " + size);		
      	
      	//모든 객체를 하나씩 가져오기
      	for(Friend f : friendArray) {
			f.showInfo();;
		}
      	System.out.println();
        
        sc.close();
    }
}
