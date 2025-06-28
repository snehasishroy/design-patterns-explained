package Observer;

public interface Subject<T> {
    boolean addObserver(Observer<T> observer);

    boolean removeObserver(Observer<T> observer);

    void notifyObservers(T data);
}
