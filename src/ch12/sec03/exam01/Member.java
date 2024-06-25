package ch12.sec03.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override	//Object의 equals() 메소드 재정의
	public boolean equals(Object obj) {		//obj가 Member 타입인지 검사하고 타입 변환 후 target 변수에 대입
		if(obj instanceof Member target) {
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}
}
