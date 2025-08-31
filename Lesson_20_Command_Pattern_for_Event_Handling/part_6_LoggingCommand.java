class LoggingCommand implements Command {
    private Command wrappedCommand;

    public LoggingCommand(Command wrappedCommand) {
        this.wrappedCommand = wrappedCommand;
    }

    @Override
    public void execute() {
        System.out.println("Executing command: " + wrappedCommand.getClass().getSimpleName());
        wrappedCommand.execute();
    }

    @Override
    public void undo() {
        System.out.println("Undoing command: " + wrappedCommand.getClass().getSimpleName());
        wrappedCommand.undo();
    }
}
