package dk.cngroup.round6;

import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public class Cell2 {

    int x, y;

    @Getter
    private boolean isAlive;

    public Cell2(int x, int y) {
        isAlive = true;
        this.x = x;
        this.y = y;
    }

    public Cell2(int x, int y, boolean isAlive) {
        this.x = x;
        this.y = y;
        this.isAlive = isAlive;
    }

    public long countN(List<Cell2> list) {
        return list.stream().filter(c -> Math.abs(c.x - this.x) <= 1 && Math.abs(c.y - this.y) <= 1).count() - 1;
    }

    public void applyRule(long numberOfNeighbours) {

        if (this.isAlive) {

            if (numberOfNeighbours < 2) {
                isAlive = false;
            }
            if (numberOfNeighbours >= 2 && numberOfNeighbours <= 3) {
                isAlive = true;
            }
            if (numberOfNeighbours > 3) {
                isAlive = false;
            }


        } else {
            if (numberOfNeighbours == 3) {
                isAlive = true;
            }
        }
    }
}
