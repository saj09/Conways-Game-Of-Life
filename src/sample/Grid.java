package sample;

public class Grid {
    int Rows;
    int Cols;
    Cell[][] cells;
    Cell[] AliveCells;
    int ZoomLevel;
    int Counter;

    Grid()
    {

    }

    Grid( int Rows,int Cols,Cell[][] cells,Cell[] AliveCells,int ZoomLevel,int Counter)
    {
        this.Rows=Rows;
        this.Cols=Cols;
        this.ZoomLevel=ZoomLevel;
        this.Counter=Counter;
        cells[Rows][Cols]=new Cell();
        AliveCells[Rows]=new Cell();
    }

    Cell[][] GetAllCells()
    {
        return cells;
    }

    Cell[] GetActiveCells()
    {
        return AliveCells;
    }

    int GetZoom()
    {
        return ZoomLevel;
    }

    void SetZoom(int Zoom)
    {
        this.ZoomLevel=Zoom;
    }

    void EvolveCell(Cell[] cell)
    {

    }

}
