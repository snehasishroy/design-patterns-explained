package Strategy;

import java.util.List;

public class MergeSort<T> implements SortingStrategy<T> {
    @Override
    public List<T> execute(List<T> list) {
        System.out.println("Performing merge sort");
        return list;
    }
}
