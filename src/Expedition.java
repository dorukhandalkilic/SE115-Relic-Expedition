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
        this.map = new char[0][0];
        this.row = -1;
        this.column = -1;
        this.energy = 0;
        this.maxEnergy = 0;
        this.collectedRelicts = 0;
        this.requireRelics = 0;
        this.moves = 0;
        this.status = "NOT STARTED";





    }

}
