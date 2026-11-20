public class Expedition {



    private char[][] map;
    private int column;
    private int row;
    private double energy;
    private int maxEnergy;
    private int moves;
    private String status;
    private int collectedRelicts;
    private int requireRelics;



    public Expedition () {
        map = new char[0][0];
        row = -1;
        column = -1;
        energy = 0;
        maxEnergy = 0;
        collectedRelicts = 0;
        requireRelics = 0;
        moves = 0;
        status = "NOT STARTED";
    }

    public boolean startNewGame(int rows, int cols) {
        return false;
    }

    public char[][] getMap() {
        return new char[0][0];
    }

    public String move(String direction) {
        return "İNVALİD COMMAND";
    }

    public String renderMap() {
        return "";
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getEnergy() {
        return energy;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getCollectedRelicts(){
        return collectedRelicts;
    }

    public int getRequireRelics() {
        return requireRelics;
    }

    public int getMoves() {
        return moves;
    }

    public String getStatus() {
        return status;
    }
    public double getScore() {
        return (100 * collectedRelicts) + (5 * energy);
    }

}


