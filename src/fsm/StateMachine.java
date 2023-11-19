package fsm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

record Node(State to, Trigger trigger, Action<? extends Context> action) {
}

public class StateMachine {
    State currentState;
    Map<State, List<Node<T>>> states = new HashMap<>();

    public StateMachine(State initialState) {
        this.currentState = initialState;
    }


    public void addTransition(State from, State to, Trigger trigger, Action action) {
        Node node = new Node(to, trigger, action);
        states.computeIfAbsent(from, __ -> new ArrayList<>()).add(node);
    }

    public void handleTrigger(Trigger trigger) {
        Node target = states.getOrDefault(currentState, new ArrayList<>()).stream()
                .filter(node -> node.trigger().equals(trigger))
                .findAny()
                .orElseThrow(() -> new RuntimeException("No trigger defined for " + currentState));
        target.action().apply();
    }
}
