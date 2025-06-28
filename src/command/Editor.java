package command;

public class Editor {
    String text;
    int r;
    int c;

    public void execute(Command command) {
        command.execute();
    }

    public String getSelection() {
        return "abc";
    }
}
