// Import section.
import java.io.File

// Creating new file.txt as global val
val file = File("file.txt")

// Write value to file.txt function.
fun writeToFile() {

    // Writing value of #FFFFFF in file.
    file.writeText("#FFFFFF") // Change content value of file.txt
    println("Value successfully writhed in: $file")
}

// Read value from file.txt function.
fun readFromFile() {

    // Reading content of the file.
    val content = file.readText()
    println("Reading value from file: $content")

    // Basic condition if value of content is matching.
    if (content == "#FFFFFF") {
        println("That is white color!")
    } else {
        println("That is not white color at all!")
    }
}

// Main program function.
fun main() {

    // Calling functions.
    writeToFile()
    readFromFile()
}