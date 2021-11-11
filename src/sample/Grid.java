package sample;

public class Grid {
    int Rows;
    int Cols;
    Cell[][] cells;
    Cell[] AliveCells;
    int ZoomLevel;
    int Counter;

    public Grid()
    {

    }

    public Grid( int Rows,int Cols,Cell [][] cells,Cell[] AliveCells,int ZoomLevel,int Counter)
    {
        this.Rows=Rows;
        this.Cols=Cols;
        this.ZoomLevel=ZoomLevel;
        this.Counter=Counter;
        cells[Rows][Cols]=new Cell();
        AliveCells[Rows]=new Cell();
    }

    public  Cell[][] GetAllCells()
    {
        return cells;
    }

    public Cell[] GetActiveCells()
    {
        return AliveCells;
    }

    public int GetZoom()
    {
        return ZoomLevel;
    }

    public void SetZoom(int Zoom)
    {
        this.ZoomLevel=Zoom;
    }

    public  void EvolveCell(Cell[] cell)
    {

    }

    public int getRows() {
        return Rows;
    }

    public void setRows(int rows) {
        Rows = rows;
    }

    public int getCols() {
        return Cols;
    }

    public void setCols(int cols) {
        Cols = cols;
    }

    public int getZoomLevel() {
        return ZoomLevel;
    }

    public void setZoomLevel(int zoomLevel) {
        ZoomLevel = zoomLevel;
    }

    public int getCounter() {
        return Counter;
    }

    public void setCounter(int counter) {
        Counter = counter;
    }
}
