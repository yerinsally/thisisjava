package problem;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

    public static void main(String[] args) {
        List<Shape> sList = new ArrayList<Shape>(); 
        
        Shape r = new Rectangle( 5, 6 );
        Shape t = new RectTriangle( 6, 2 );
        sList.add(r);
        sList.add(t);
        
        
        for( int i=0; i<sList.size(); i++ ) {
            
            System.out.println( "area: " + sList.get(i).getArea() );
            System.out.println( "perimeter: " + sList.get(i).getPerimeter() );
            
            if( sList.get(i) instanceof Resizeable ) {		//Resizable(인터페이스) 같은 타입인지 확인
                ((Resizeable)sList.get(i)).resize(0.5);		//기본 타입(int, String) / 내가 선언한 참조 타입(객체)
                
                System.out.println( "new area: " + sList.get(i).getArea() );
                System.out.println( "new perimeter: " + sList.get(i).getPerimeter() );
            }
        }
    }
}
