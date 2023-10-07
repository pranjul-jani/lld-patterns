package behavioural.strategypattern.code;

public class Main {

    public static void main(String[] args) {

        int[] arr = {23, 32, 87, 9, 3, 21, 67};

        SortingContext sortingContext = new SortingContext(new QuickSortTechnique());
        sortingContext.sortArray(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
