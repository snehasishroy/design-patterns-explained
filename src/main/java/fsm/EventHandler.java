package fsm;

/**
 * There is a difference
 * public interface EventHandler1<T> {
 *     T handleEvent(Event event);
 * }
 * Here in the handler, you need to cast the event to the concrete event
 * but if you use
 * EventHandler<T, E extends Event> {
 *     T handleEvent(E event);
 * }
 * Here E will be the concrete event, it will be captured by the compiler
 */
public interface EventHandler<T, E extends Event> {
    T handleEvent(E event);
}