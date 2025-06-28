package command;

public class CopyCommand extends Command{

    public CopyCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public void execute() {
        application.clipboard = editor.getSelection();
    }

    @Override
    public void undo() {

    }
}
