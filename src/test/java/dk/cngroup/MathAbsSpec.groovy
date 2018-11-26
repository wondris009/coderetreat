package dk.cngroup

import spock.lang.Specification

class MathAbsSpec extends Specification {

    def 'first test'() {

        when:
        def result = Math.abs(-1)

        then:
        result == 1
    }
}
