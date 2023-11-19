package fsm;

public class EmailAction implements Action<Context> {
    @Override
    public boolean apply(Context emailContext) {
        System.out.println(emailContext);
        return true;
    }
}
