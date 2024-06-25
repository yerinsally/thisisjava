package problem;

public abstract class Shape {
    private int countSides;
    
    public Shape(int countSides) {
    	this.countSides = countSides;
    }
	public int getCountSides() {
		return countSides;
	}
	
	public abstract double getArea();
    public abstract double getPerimeter();
}

//추상 메소드를 쓰는 이유는 도형 넓이와 둘레가 달라서 부모 클래스 = 추상 메소드, 자식 클래스가 상속받아서 재정의하도록 함 (Override 필수)
//추상 클래스보다 더 추상화된게 인터페이스(public abstract 생략해도됨, void부터 시작 : 선언만 함) (다중 상속 X)
//인터페이스 -> 구현한다 implements(여러 개 가능, 무조건 재정의)
//추상 메소드가 하나라도 있으면 추상 클래스가 되는데, 그 안에 기본 클래스도 선언 가능