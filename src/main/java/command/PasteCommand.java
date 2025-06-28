package command;

public class PasteCommand extends Command {
    public PasteCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public void execute() {
        application.editor.text += application.clipboard;
    }

    @Override
    public void undo() {
        
    }
}
