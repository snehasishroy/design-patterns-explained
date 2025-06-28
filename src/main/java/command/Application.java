package command;

import java.util.Stack;

public class Application {
    Editor editor;
    String clipboard;
    Stack<Command> commandHistory = new Stack<>();

    public Application(Editor editor) {
        this.editor = editor;
    }

    // application(sender/producer) wants to execute some operations on the editor(receiver/consumer)
    // one option is to execute specific functions on the editor by passing appropriate arguments
    // command design pattern converts the arguments into command objects
    public void performCopyStrategy() {
        // this is a strategy pattern, where the editor is simply calling command.execute()
        // here application is acting on the editor through the command
        // this creates a coupling between the sender and the receiver
        editor.execute(new CopyCommand(this, editor));
    }

    public void performPasteStrategy() {
        editor.execute(new PasteCommand(this, editor));
    }

    // correct way: sender usually doesn't create the command object, it's passed from the client
    // sender communicates with the receiver through the command
    // sender is not aware of the receiver
    public void runCommand(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    // this is also a key benefit of the command pattern
    public void undoCommand() {
        if (!commandHistory.isEmpty()) {
            commandHistory.pop().undo();
        }
    }
}
