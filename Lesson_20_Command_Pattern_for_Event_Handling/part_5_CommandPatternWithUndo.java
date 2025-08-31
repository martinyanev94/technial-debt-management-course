class Invoker {
    private Stack<Command> commandHistory = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undoCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("No commands to undo!");
        }
    }
}
public class CommandPatternWithUndoExample {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Command saveCommand = new SaveCommand(editor);
        Invoker invoker = new Invoker();

        invoker.executeCommand(saveCommand); // Output: Document saved!
        invoker.undoCommand(); // Output: Document saved! undone!
        invoker.undoCommand(); // Output: No commands to undo!
    }
}
