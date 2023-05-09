package Model;

public class Omok {
    private boolean ready;
    private boolean myTurn;
    private Board board;
    private String color;

    public Omok()
    {
        ready=false;
        myTurn=false;
        createBoard();
    }

    public void createBoard()
    {
        this.board= new Board(15,15);
    }
}
