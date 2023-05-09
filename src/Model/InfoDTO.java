package Model;

import java.io.Serializable;

enum Command{
    Join, Exit, Board
}

public class InfoDTO implements Serializable {
    private int x;
    private int y;
    private Command Command;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Model.Command getCommand() {
        return Command;
    }

    public void setCommand(Model.Command command) {
        Command = command;
    }
}
