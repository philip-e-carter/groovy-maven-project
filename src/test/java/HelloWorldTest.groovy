import spock.lang.Specification

class HelloWorldTest extends Specification {

    def "one plus one is two"  () {
        given: "given the class to be tested"
            def hw = new HelloWorld()
        when: "and adding one plus one"
            def a = hw.add([1, 1]);
        then: "the sum should be 2"
            a == 2;
    }

    def "test a groovy 'range'" () {
        given: "a range"
            def helloWorld = new HelloWorld();
        when: "stuff happens"
            def result = helloWorld.getRange();
        then:
            result.size() == 3;
    }

}

