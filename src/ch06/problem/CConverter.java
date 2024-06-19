package ch06.problem;

public class CConverter {
    
    public static double rate;
    
    public static void setRate(double r){
        CConverter.rate = r;
    }
    
    public static double toDoller(double won){
        return won / rate;
    }

    public static double toKRW(double dollar){
        return dollar * rate;
    }
    

}
