package fsm;

import java.util.Set;

public interface FiniteStateMachine {
    State getCurrentState();

    State getInitialState();

    Set<State> getFinalStates();

    Set<State> getStates();

    Set<Transition> getTransitions();

    void registerTransition(Transition transition);

    void registerFinalState(State state);

    // based on the event, FSM will make a transition to the next state
    State fire(Event event);
}
