package dk.cngroup.round1;

import java.util.ArrayList;
import java.util.List;

public class World {

    public int WIDTH = 100;
    public int HEIGHT = 100;

    List<Cell> world = new ArrayList<>();

    public World() {

        initCells();




    }

    private void initCells() {

        for (int x = 0; x < WIDTH; x++) {

            for (int y = 0; y < HEIGHT; y++) {



                Cell actualCell = new Cell(x, y);

                actualCell.calculateNeighbours();








            }


        }





    }

    public void redrawWorld() {





    }

    void prochazej() {

        for (int x = 0; x < WIDTH; x++) {

            for (int y = 0; y < HEIGHT; y++) {



                Cell actualCell = new Cell(x, y);

                actualCell.calculateNeighbours();








            }


        }




    }




}
