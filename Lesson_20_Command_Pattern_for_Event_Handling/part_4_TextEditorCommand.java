interface Command {
    void execute();
    void undo();
}
class TextEditor {
    private List<String> history = new ArrayList<>();

    public void save() {
        history.add("Document saved!");
        System.out.println("Document saved!");
    }

    public void undo() {
        if (!history.isEmpty()) {
            String lastAction = history.remove(history.size() - 1);
            System.out.println(lastAction + " undone!");
        } else {
            System.out.println("No action to undo!");
        }
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

    @Override
    public void undo() {
        editor.undo();
    }
}
