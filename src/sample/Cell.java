package sample;

public class Cell {
    int Pos_x;
    int Pos_y;
    boolean IsAlice;

    Cell()
    {

    }

    Cell(int Pos_x ,int Pos_y ,boolean IsAlive)
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
}
