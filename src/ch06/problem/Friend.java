package ch06.problem;

public class Friend {
	
    private String name;
    private String hp;
    private String school;
    
    //메소드 작성 : 생성자 만들기(Source > Generate Constructor using Fields)
    public Friend(String name, String hp, String school) {
    	this.name = name;
    	this.hp = hp;
    	this.school = school;
    }
    //출력 메소드
    public void showInfo(){
        System.out.println("이름: "+name+"  핸드폰: "+hp+"  학교: "+school);
    }
}
 