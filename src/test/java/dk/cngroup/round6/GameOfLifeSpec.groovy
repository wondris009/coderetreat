package dk.cngroup.round6

import spock.lang.Specification

class GameOfLifeSpec extends Specification {

    def 'It should add a cell to a grid'() {

        given:
        GameOfLife gameOfLife = new GameOfLife()

        when:
        gameOfLife.addCell(new Cell(1,1, true))


        then:
        gameOfLife.cells.size() == 1
    }

    def 'should count all neighbours of selected cell'() {

        given:
        def n0 = new Cell(1,1, true)
        def n1 = new Cell(1,2, true)
        def n2 = new Cell(1,0, true)

        when:
        def neigh = n0.countN([n1, n2, n0])

        then:
        neigh == 2
    }

    def 'should correcyly set new state for cell'() {

        given:
        def world = new GameOfLife()
        world.addCell(new Cell(1,1))
        world.addCell(new Cell(1,2))
        world.addCell(new Cell(1,3))

        when:
        world.calculateNewWord()

        then:
        world.getAllLiveCells() == 1
    }

}
