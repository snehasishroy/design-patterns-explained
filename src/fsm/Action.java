package fsm;


public interface Action<T extends Context> {
    boolean apply(T data);
}
