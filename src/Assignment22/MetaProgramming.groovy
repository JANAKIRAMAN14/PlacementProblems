package Assignment22

//class MetaProgramming {
//}
// =====================
// 1. File Read/Write with Try-Catch-Finally
// =====================
def filename = "myfile.txt"

try {
    // Write your name to a file
    new File(filename).text = "M.S. Janaki Raman"

    // Read from the file
    def content = new File(filename).text
    println "File content: $content"

    // Divide-by-zero test
    def result = 10 / 0  // This will throw ArithmeticException

} catch (ArithmeticException e) {
    println "Error: Cannot divide by zero."

} catch (FileNotFoundException e) {
    println "Error: File not found."

} finally {
    println "Cleanup done (if necessary)."
}

// =====================
// 2. methodMissing & propertyMissing
// =====================
class DynamicHandler {
    def methodMissing(String name, args) {
        println "Method $name is not defined"
    }

    def propertyMissing(String name) {
        return "undefined"
    }
}

def dyn = new DynamicHandler()
dyn.someUnknownMethod()            // Triggers methodMissing
println dyn.someUnknownProperty    // Triggers propertyMissing

// =====================
// 3. Dynamic Property Modification (Metaprogramming)
// =====================
class DynamicPerson {
    String name
    int age
}

def person = new DynamicPerson(name: "Janaki", age: 22)

// Dynamically add a new property
person.metaClass.email = "janaki@example.com"

// Dynamically change behavior of existing method
person.metaClass.toString = { -> "DynamicPerson(name: $delegate.name, age: $delegate.age, email: $delegate.email)" }

println person.email
println person.toString()
