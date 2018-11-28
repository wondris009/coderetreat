package dk.cngroup.round4

import spock.lang.Specification

class GameOfLiveSpec extends Specification {


    def 'should create world and can add cells'() {

        when:
        def world = new World()

        def cell1 = new Cell()
        world.addCell(cell1)

        then:
        world != null
        cell1 != null
        world.cells.size() > 0
    }

    def 'cell have properties - liveness'() {

        when:
        def cell = new Cell()
        cell.setAlive(true)

        then:
        cell.isAlive
    }

    def 'cell have properties - location'() {

        when:
        def cell = new Cell(10, 10)

        then:
        cell.x == 10
        cell.y == 10
    }

    def 'if there are 2 cells in the world next to each other they are neighbours'() {

        when:
        def actualCell = new Cell(0,0)

        def cell2 = new Cell(1,0)
        def cell3 = new Cell(1,1)
        def cell4 = new Cell(1,-1)
        def cell5 = new Cell(0,-1)
        def cell6 = new Cell(-1,-1)
        def cell7 = new Cell(-1,0)
        def cell8 = new Cell(-1,1)
        def cell9 = new Cell(0,1)


        def cell10 = new Cell(20,21)

        then:
        actualCell.isNeighbour(cell2)
        actualCell.isNeighbour(cell3)
        actualCell.isNeighbour(cell4)
        actualCell.isNeighbour(cell5)
        actualCell.isNeighbour(cell6)
        actualCell.isNeighbour(cell7)
        actualCell.isNeighbour(cell8)
        actualCell.isNeighbour(cell9)

        !actualCell.isNeighbour(cell10)





    }













}
