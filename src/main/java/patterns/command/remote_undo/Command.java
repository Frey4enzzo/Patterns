package patterns.command.remote_undo;


public interface Command {

    public void execute();

    // метод для отмены последней операции, выполненной через execute()
    public void undo();
}
