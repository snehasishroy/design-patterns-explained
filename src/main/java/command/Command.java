package command;

public abstract class Command {
    protected Editor editor;
    protected Application application;

    public Command(Application application, Editor editor) {
        this.editor = editor;
        this.application = application;
    }

    public abstract void execute();

    public abstract void undo();
}
