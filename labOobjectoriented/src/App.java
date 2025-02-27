import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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

    public static void random_number_thing() {
        ArrayList<Float> source_data = new ArrayList<>();
        // First need to create a PRNG engine
        Random prng = new Random();
        // generate 1000 elements between -1000 and 1000
        int N = 1000;
        for (int i=0; i<N; ++i) {
        source_data.add( prng.nextFloat(-1000.0F, 1000.0F) );

        if ( source_data.size() != N) {
            System.out.println("Data is not right size");
        }

        }
    }
    
}
