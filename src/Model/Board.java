package Model;

public class Board {
    private Cell[][] Cells;
    private int row;
    private int cols;

    public Board(int row, int cols)
    {
        this.row=row;
        this.cols=cols;

        Cells=new Cell[row][cols];

        createEmptyCells();
    }

    public void createEmptyCells()
    {
        for(int x=0;x<row;x++)
        {
            for(int y=0;y<cols;y++)
            {
                Cells[x][y]=new Cell();
            }
        }
    }

    public Cell[][] getCells(){return Cells;}
    public int getRow(){return row;}
    public int getCols(){return cols;}
}
