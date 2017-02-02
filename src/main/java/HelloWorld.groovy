println "can run random groovy statements in a .groovy script, no class and methods needed, as long there isn't also a java class in the file"

def add(numbers) {
    def sum = 0;
    for (number in numbers) {
        sum = sum + number
    }
    sum // "return" is not needed
}

def getRange() {
    def rng = 1..3
    rng
}

def changeTypeAtRuntime() {
    def var = 1;
    var = "hello"
    var
}

def getHelloMessage(String s) {
    "Hello ${s}"
}