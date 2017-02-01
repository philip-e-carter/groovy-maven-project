import spock.lang.Specification

class HelloWorldTest extends Specification {

    def "one plus one is two"  () {
        given:
            def hw = new HelloWorld()
        when:
            def a = hw.hello();
        then:
            a == "Hello World"
    }
    
}
