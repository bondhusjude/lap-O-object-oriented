import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TimingSortAndSearch {
    ArrayList<Float> data = new ArrayList<>();
    private float randomChosenNum;
    private final int arraySize;
    Random prng = new Random();

    public TimingSortAndSearch( int arraySize ) {
        this.arraySize = arraySize;
        // initializing arraylist with proper integer amount
        for (int n = 0; n < arraySize; n++) {
            data.add(prng.nextFloat( 0.0f, 1.0f ));
        }
        // ensure arraylist is correct size
        assert (data.size() == arraySize);
        // grab random number from middle of array
        this.randomChosenNum = data.get( arraySize / 2 ) ;
    }

    public void createNewData() {
        data.clear();
        // initializing arraylist with proper integer amount
        for (int n = 0; n < arraySize; n++) {
            data.add(prng.nextFloat(-1000.0F, 1000.0F));
        }
        // ensure arraylist is correct size
        assert (data.size() == arraySize);
        // grab random number from middle of array
        this.randomChosenNum = data.get( arraySize / 2 ) ;
    }

    public float calculateSortTime() {
        // starting sort timing
        long sortStartTime = System.nanoTime();
        // sorting data
        Collections.sort(data);
        // calculating sort timing
        long sortEndTime = System.nanoTime();
        return (sortEndTime - sortStartTime) / 1000000.0f;
    }

    public float calculateSearchTime() {
        // starting search timing
        long searchStartTime = System.nanoTime();
        int index = Collections.binarySearch( data, randomChosenNum );
        // calculating search timing
        long searchEndTime = System.nanoTime();
        assert( data.get( index ) == randomChosenNum );
        return (searchEndTime - searchStartTime) / 1000000.0f;
    }
}

