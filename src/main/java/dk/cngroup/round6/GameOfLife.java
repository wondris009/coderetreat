package dk.cngroup.round6;

import java.util.ArrayList;
import java.util.List;

public class GameOfLife {

    List<Cell> cells = new ArrayList<>();

    public void addCell(Cell cell) {
        this.cells.add(cell);
    }

    void calculateNewWord() {


        cells.forEach(cell -> {

            long numberOfNeighbours = cell.countN(cells);

            cell.applyRule(numberOfNeighbours);



        });






    }

    public long getAllLiveCells() {
        return this.cells.stream().filter(Cell::isAlive).count();
    }



}
