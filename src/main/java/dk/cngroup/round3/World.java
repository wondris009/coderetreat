package dk.cngroup.round3;

import java.util.ArrayList;
import java.util.List;

public class World {

    List<Cell> cells = new ArrayList<>();

    public void addCell(Cell cell) {
        cells.add(cell);
    }
}
