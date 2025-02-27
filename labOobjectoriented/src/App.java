import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) throws Exception {
        
        ArrayList< Integer > data = new ArrayList<>();
        data.add( 13 );
        data.add( 3 );
        data.add( 32 );
        Collections.sort( data );
        
        int previous_num = data.get(0);
        for ( Integer n : data ) {
            if ( n >= previous_num ) {
                previous_num = n;
            } else {
                System.out.println("Data is not sorted");
                break;
            }
        }

         for ( Integer n : data ) {
     System.out.println( "Item: " + n );
        }

    }
}
