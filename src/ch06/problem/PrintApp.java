package ch06.problem;

public class PrintApp {

    public static void main(String[] args) {

        Print print = new Print();
        
        print.printer(10);
        print.printer(true);
        print.printer(5.7);
        print.printer("홍길동");
    }
}
