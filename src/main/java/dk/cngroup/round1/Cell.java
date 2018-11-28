package dk.cngroup.round1;

import java.util.ArrayList;
import java.util.List;

public class Cell {

    public int x,y = 0;

    public boolean isAlive = false;

    public List<Cell> aliveNeighbours = new ArrayList<>();

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void calculateNeighbours() {

        Cell c1 = new Cell(x-1, y +1);
        Cell c2 = new Cell(x, y +1);
        Cell c3 = new Cell(x-1, y +1);

        Cell c4 = new Cell(x+1, y);
        Cell c5 = new Cell(x-1, y);

        Cell c6 = new Cell(x-1, y -1);
        Cell c7 = new Cell(x, y -1);
        Cell c8 = new Cell(x-1, y -1);

        addAliveCell(c1);
        addAliveCell(c2);
        addAliveCell(c3);
        addAliveCell(c4);
        addAliveCell(c5);
        addAliveCell(c6);
        addAliveCell(c7);
        addAliveCell(c8);


    }

    boolean isCellAliveForNewWorld(Cell cell) {

        boolean result = false;

        if(cell.isAlive && cell.aliveNeighbours.size() < 2) {
            result = false;
        }

        if(cell.isAlive && cell.aliveNeighbours.size() >= 2 && cell.aliveNeighbours.size() <= 3) {
            result = true;
        }

        if(cell.isAlive && cell.aliveNeighbours.size() > 3) {
            result = false;
        }

        if(!cell.isAlive && cell.aliveNeighbours.size() == 3) {
            result = true;
        }

        return result;
    }

    private void addAliveCell(Cell c) {
        if(c.isAlive) {
            aliveNeighbours.add(c);
        }
    }
}
