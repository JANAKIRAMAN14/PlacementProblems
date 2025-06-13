package Assignment21

// 1. calculator :
   def calculate(a, b, operation) {
        operation(a, b)
    }

// Define closures for operations
    def add = { x, y -> x + y }
    def subtract = { x, y -> x - y }
    def multiply = { x, y -> x * y }

// Test the calculator
    println "Addition: " + calculate(10, 5, add)
    println "Subtraction: " + calculate(10, 5, subtract)
    println "Multiplication: " + calculate(10, 5, multiply)

// 2. count the words:
print "Enter a sentence: "
def sentence = System.console()?.readLine() ?: "hello world hello"  // Default if no console input
def words = sentence.split(/\s+/)

def wordCount = [:]

words.each { word ->
    wordCount[word] = wordCount.get(word, 0) + 1
}

wordCount.each { k, v ->
    println "$k → $v"
}

// 3
def word = ["hi", "hello", "bye", "good", "sun"]
def grouped = [:].withDefault { [] }

word.each { worde ->
    grouped[worde.length()] << worde
}

grouped.each { k, v ->
    println "$k → $v"
}
