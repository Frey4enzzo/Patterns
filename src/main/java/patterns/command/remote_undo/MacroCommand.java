package patterns.command.remote_undo;

/**
 * Эта разновидность команд может выполнять другие команды
 */

public class MacroCommand implements Command{

    // массив команд
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    // при выполнении макрокоманды все команды будут выполнены последовательно
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
