package editor;

public interface Command {
    void execute();
    void undo();
}