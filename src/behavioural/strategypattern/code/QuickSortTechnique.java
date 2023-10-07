package behavioural.strategypattern.code;

import java.util.Arrays;

public class QuickSortTechnique implements SortingTechnique {
    @Override
    public void sortIntegerArray(int[] arr) {
        //sort array according to quick sort
        System.out.println("Sorting Array through quick sort");
        Arrays.sort(arr);
    }

}
