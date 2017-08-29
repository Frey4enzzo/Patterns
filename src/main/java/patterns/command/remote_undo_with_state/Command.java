package patterns.command.remote_undo_with_state;

public interface Command {

    void execute();

    void undo();
}
