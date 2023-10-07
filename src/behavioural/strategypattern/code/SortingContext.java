package behavioural.strategypattern.code;

public class SortingContext {
    SortingTechnique sortingTechnique;

    public SortingContext(SortingTechnique technique) {
        this.sortingTechnique = technique;
    }

    public void sortArray(int[] arr) {
        sortingTechnique.sortIntegerArray(arr);
    }
}
