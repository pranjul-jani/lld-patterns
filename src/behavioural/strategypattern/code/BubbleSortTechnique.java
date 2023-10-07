package behavioural.strategypattern.code;

import java.util.Arrays;

public class BubbleSortTechnique implements SortingTechnique {

    @Override
    public void sortIntegerArray(int[] arr) {
        //sort array according to bubble sort
        System.out.println("Sorting Array through bubble sort");
        Arrays.sort(arr);
    }

}
