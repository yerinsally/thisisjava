package problem;

public class RectTriangle extends Shape {
    private double base;
    private double height;

    public RectTriangle(double base, double height) {
    	super(3);		//super : 부모 클래스(Shape)의 생성자 호출 및 인스턴스 변수(countSides) 초기화 + 값 설정
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}

