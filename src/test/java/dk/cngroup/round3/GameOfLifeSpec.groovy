package dk.cngroup.round3

import spock.lang.Specification

class GameOfLifeSpec extends Specification {

    def world = new World()

    def 'should create cell with location' (){

        when:
        def location = new Location(15, 20)
        def cell = new Cell(location)


        then:
        cell.location.x == location.x && cell.location.y == location.y && cell.active
    }

    def 'cell could have some neighbours'() {

        when:

        def cell1 = new Cell(new Location(10,10))
        def cell2 = new Cell(new Location(11,10))
        world.addCell(cell1)
        world.addCell(cell2)

        then:
        cell1.getNeighbours(world.cells) == 1
        cell2.getNeighbours(world.cells) == 1

    }

    def 'cell could have some above and below neighbours'() {

        when:
        def cell1 = new Cell(new Location(10,10))
        def cell2 = new Cell(new Location(10,11))
        world.addCell(cell1)
        world.addCell(cell2)

        then:
        cell1.getNeighbours(world.cells) == 1
        cell2.getNeighbours(world.cells) == 1

    }

    def 'cells are not neighbours'() {

        when:
        def cell1 = new Cell(new Location(10,10))
        def cell2 = new Cell(new Location(9,12))
        world.addCell(cell1)
        world.addCell(cell2)

        then:
        cell1.getNeighbours(world.cells) == 0

    }




}
