package Strategy;

import java.util.List;

public interface SortingStrategy<T> {
    List<T> execute(List<T> list);
}
