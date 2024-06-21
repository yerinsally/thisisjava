package problem01;

public class Add {
	private int a;
    private int b;

    public void setValue(int a, int b) {	//값 저장하는 용도
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a + b;
    }
}
