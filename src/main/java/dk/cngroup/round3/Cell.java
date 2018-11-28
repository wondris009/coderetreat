package dk.cngroup.round3;

import java.util.List;
import java.util.stream.Collectors;

public class Cell {

    boolean active = true;

    Location location;

    int neighbours = 0;

    public Cell(Location location) {
        this.location = location;
    }

    public int getNeighbours(List<Cell> world) {

        return world.stream().filter(cell -> hasNeighbours(cell)).collect(Collectors.toList()).size();
    }

    public boolean isNeighbour(Cell potentialNeighbour){
        return this.location.x == potentialNeighbour.location.x + 1 || this.location.x == potentialNeighbour.location.x - 1;
    }

    public boolean hasAboveNeighbours(Cell potentialNeighbour){
        return this.location.y == potentialNeighbour.location.y + 1 || this.location.y == potentialNeighbour.location.y - 1;
    }

    public boolean hasNeighbours(Cell potentialNeighbour) {
        return isNeighbour(potentialNeighbour) || hasAboveNeighbours(potentialNeighbour);
    }


}
