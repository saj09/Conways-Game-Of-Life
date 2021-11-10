package sample;

public class Game {
    boolean IsRunning;
    int Speed;
    Grid board;
    State[] loadedStates;
    int ZoomFactor;
    int CellInFrame;
    int TotalCell;
    Grid initialBoard;

    public Game() {

    }

    public Game(boolean isRunning, int speed, Grid board, State[] loadedStates, int zoomFactor, int cellInFrame, int totalCell, Grid initialBoard) {
        IsRunning = isRunning;
        Speed = speed;
        this.board = board;
        this.loadedStates = loadedStates;
        ZoomFactor = zoomFactor;
        CellInFrame = cellInFrame;
        TotalCell = totalCell;
        this.initialBoard = initialBoard;
    }

    public void Start() {

    }

    public void Stop() {

    }

    public void Next() {

    }

    public void Reset() {

    }

    public void ShowSavedStates(int[] Ids) {

    }

    public void LoadSpecificState(int ID) {

    }

    public void DeleteState(int ID) {

    }

    public void DeleteAllStates()
    {

    }

    public void SaveState()
    {

    }

    public boolean isRunning() {
        return IsRunning;
    }

    public void setRunning(boolean running) {
        IsRunning = running;
    }


    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public Grid getBoard() {
        return board;
    }

    public void setBoard(Grid board) {
        this.board = board;
    }

    public State[] getLoadedStates() {
        return loadedStates;
    }

    public void setLoadedStates(State[] loadedStates) {
        this.loadedStates = loadedStates;
    }

    public int getZoomFactor() {
        return ZoomFactor;
    }

    public void setZoomFactor(int zoomFactor) {
        ZoomFactor = zoomFactor;
    }

    public int getCellInFrame() {
        return CellInFrame;
    }

    public void setCellInFrame(int cellInFrame) {
        CellInFrame = cellInFrame;
    }

    public int getTotalCell() {
        return TotalCell;
    }

    public void setTotalCell(int totalCell) {
        TotalCell = totalCell;
    }

    public Grid getInitialBoard() {
        return initialBoard;
    }

    public void setInitialBoard(Grid initialBoard) {
        this.initialBoard = initialBoard;
    }
}
