import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class App {

    public static void first_function(String[] args) throws Exception {
        
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
        timing_function();
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
    
    public static void timing_function() {
        double avgTime_ms = 0.0;
        int N = 3;
        for (int i=0; i<N; ++i) {
        
        long startTime = System.nanoTime();
        
        // how long does it take to sum up 0.1 a million times?
        float sum = 0.0F;
        for (int j=0; j<1000000; ++j) {
        sum += 0.000001F;
        }
        long endTime = System.nanoTime();
        long diffTime = endTime - startTime;
        System.out.println( "\tsum = " + sum );
        // get the difference in milliseconds
        avgTime_ms += diffTime / 1000000.0;
        }
        avgTime_ms = avgTime_ms / (float)N;
        System.out.println( "Average time: " + avgTime_ms + " ms" );
        
    }

    //mainnnn stufffff for SORTTTT

    public static void main(String[] args) {
        int arraySize = 10000000;
        int sampleNum = 10;
        float avgSearchTime = 0.0f;
        float avgSortTime = 0.0f;
        TimingSortAndSearch data = new TimingSortAndSearch(arraySize);


        for (int i = 0; i < sampleNum; i++) {
            avgSortTime += data.calculateSortTime() / sampleNum;
            avgSearchTime += data.calculateSearchTime() / sampleNum;
            data.createNewData();
        }


        System.out.println( "Average sort time: " + avgSortTime + "ms");
        System.out.println( "Average search time: " + avgSearchTime + "ms");
}
    
}

