package command;

public class Editor {
    String text;
    int r;
    int c;

    public void execute(Command command) {
        // this is wrong - this acts as a strategy pattern in which the editor is a simple pass through
        // correct way is the sender invoking the command object which manipulates the receiver
        command.execute();
    }

    public String getSelection() {
        return "abc";
    }
}
