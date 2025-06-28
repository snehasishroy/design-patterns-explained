package fsm;

import java.util.HashSet;
import java.util.Set;

public class FiniteStateMachineImpl implements FiniteStateMachine {
    private final State initialState;
    private State currentState;
    private Set<Transition> transitions;
    private Set<State> finalStates;
    private Set<State> states;
    public FiniteStateMachineImpl(State initialState) {
        this.initialState = initialState;
        transitions = new HashSet<>();
        states = new HashSet<>();
        finalStates = new HashSet<>();
        states.add(initialState);
    }

    @Override
    public State getCurrentState() {
        return currentState;
    }

    @Override
    public State getInitialState() {
        return initialState;
    }

    @Override
    public Set<State> getFinalStates() {
        return finalStates;
    }

    @Override
    public Set<State> getStates() {
        return states;
    }

    @Override
    public Set<Transition> getTransitions() {
        return transitions;
    }

    @Override
    public void registerTransition(Transition transition) {
        transitions.add(transition);
        states.add(transition.getFromState());
        states.add(transition.getToState());
    }

    @Override
    public void registerFinalState(State state) {
        finalStates.add(state);
    }

    @Override
    public State fire(Event event) {
        if (finalStates.contains(currentState)) {

        }
    }
}
