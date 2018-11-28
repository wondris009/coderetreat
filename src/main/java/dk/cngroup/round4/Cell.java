package dk.cngroup.round4;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Cell {

    int x,y;

    List<Cell> neighborsCells = new ArrayList<>();

    @Setter
    boolean isAlive = false;

    public Cell() {
    }

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isNeighbour(Cell cell) {
        return
                this.x == cell.x - 1 && this.y == cell.y
                        || this.x == cell.x + 1 && this.y == cell.y
                        || this.x == cell.x && this.y == cell.y + 1
                        || this.x == cell.x && this.y == cell.y - 1

                        || this.x == cell.x - 1 && this.y == cell.y +1
                        || this.x == cell.x + 1 && this.y == cell.y -1
                        || this.x == cell.x -1 && this.y == cell.y - 1
                        || this.x == cell.x +1 && this.y == cell.y + 1;
    }



}
