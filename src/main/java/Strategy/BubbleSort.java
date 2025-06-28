package Strategy;

import java.util.List;

public class BubbleSort<T> implements SortingStrategy<T> {
    @Override
    public List<T> execute(List<T> list) {
        System.out.println("Performing bubble sort");
        return list;
    }
}
