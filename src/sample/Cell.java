package sample;

public class Cell {
    int Pos_x;
    int Pos_y;
    boolean IsAlice;

    Cell()
    {

    }

    public  Cell(int Pos_x ,int Pos_y ,boolean IsAlive)
    {
        this.Pos_x= Pos_x;
        this.Pos_y=Pos_y;
        this.IsAlice=IsAlive;
    }

   public boolean IsAlive()
    {
        return IsAlice;
    }

    public void MakeDead()
    {

    }
    public void MakeAlive()
    {

    }

   boolean IsNeighbour(Cell [] cell)
   {
       return true;
   }

    boolean IsSameCell(Cell [] cell)
    {
        return true;
    }

    public int getPos_x() {
        return Pos_x;
    }

    public void setPos_x(int pos_x) {
        Pos_x = pos_x;
    }

    public int getPos_y() {
        return Pos_y;
    }

    public void setPos_y(int pos_y) {
        Pos_y = pos_y;
    }

    public boolean isAlice() {
        return IsAlice;
    }

    public void setAlice(boolean alice) {
        IsAlice = alice;
    }
}
