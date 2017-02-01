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

}

