class Button {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        if (command != null) {
            command.execute();
        }
    }
}
public class CommandPatternExample {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Command saveCommand = new SaveCommand(editor);
        Button saveButton = new Button();

        saveButton.setCommand(saveCommand);
        saveButton.click(); // Output: Document saved!
    }
}
