package fsm;

public interface Transition {
    String getName();
    State getFromState();
    State getToState();
    Event getEvent();
    EventHandler getEventHandler();
}
