package problem;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(4);		//super : 부모 클래스(Shape)의 생성자 호출 및 인스턴스 변수(countSides) 초기화 + 값 설정
    	this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void resize(double s) {
        width *= s;
        height *= s;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
