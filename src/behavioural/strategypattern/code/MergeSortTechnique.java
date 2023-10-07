package behavioural.strategypattern.code;

import java.util.Arrays;

public class MergeSortTechnique implements SortingTechnique {

    @Override
    public void sortIntegerArray(int[] arr) {
        //sort array according to merge sort
        System.out.println("Sorting Array through merge sort");
        Arrays.sort(arr);
    }

}
