package Strategy;

import java.util.List;

public class OrderedList<T> {
    List<T> list;
    SortingStrategy<T> strategy;
    public OrderedList(List<T> list, SortingStrategy<T> strategy) {
        this.list = list;
        this.strategy = strategy;
    }

    public List<T> sort() {
        return strategy.execute(list);
    }
}
