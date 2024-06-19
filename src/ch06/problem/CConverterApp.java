package ch06.problem;


public class CConverterApp {

    public static void main(String[] args) {
        
        CConverter.setRate(1383.58);
        System.out.println("오늘의 환율은 "+CConverter.rate+" 입니다.");
        
        //백만원을 달러로 출력
        System.out.println("100만원은 "+CConverter.toDoller(1000000)+" 달러입니다.");
        
        //100달러를 원으로 출력
        System.out.println("100달러는 "+CConverter.toKRW(100)+" 원입니다.");
    }
}
