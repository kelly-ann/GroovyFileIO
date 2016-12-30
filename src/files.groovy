/**
 * Created by ka on 12/13/16.
 */

// create a new file and write to it
def file = new File("dummyFile.txt")
file.write("Hello K-A!\n")
file.append("Hola K-A.\n")

new File("2ndDummyFile.txt").text = "Hi a 2nd time K-A!"

// print lines from file to screen
println "\nRead from file and print to screen: "
List lines = file.readLines()
lines.each { line ->
    println line
}

// list all files in a directory
println "\nList files: "
String dir = ".."
//new File(dir).eachFile { aFile ->
new File(dir).eachFileRecurse { aFile ->  // lists the files WITHIN the dirs too!
    if(aFile.isFile()) {
        println aFile.name
    }
}

println "\n\".groovy\" files: "
new File(".").eachFile { oneFile ->
    if(oneFile.name.endsWith(".groovy")) {
        println oneFile.name
    }

}
