import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) throws Exception {
        
        ArrayList< Integer > data = new ArrayList<>();
        data.add( 13 );
        data.add( 3 );
        data.add( 32 );
        Collections.sort( data );

         for ( Integer n : data ) {
     System.out.println( "Item: " + n );
        }

    }
}
