class TextEditor {
    public void save() {
        System.out.println("Document saved!");
    }
}

class SaveCommand implements Command {
    private TextEditor editor;

    public SaveCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.save();
    }
}
