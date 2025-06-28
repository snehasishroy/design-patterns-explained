package Observer;

import java.util.HashSet;
import java.util.Set;

public class JobDispatcher implements Subject<Job> {
    Set<Observer<Job>> observers = new HashSet<>();

    @Override
    public boolean addObserver(Observer<Job> observer) {
        return observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer<Job> observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObservers(Job job) {
        observers.forEach(observer -> observer.update(job));
    }
}
