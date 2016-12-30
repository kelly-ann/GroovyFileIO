/**
 * Created by ka on 12/13/16.
 */
String dir = ".."
List hidden = []

println "Print the directories: "
new File(dir).eachFile { file ->

    // print directories
    if(file.isDirectory()) {
        println file.name
    }

    // save hidden files to list to be printed
    if(file.isHidden()) {
        hidden << file.name
    }
}
println "\nThe hidden directories are: "
println hidden

println "\nSubfolders are: "
new File(dir).eachDir { subfolder ->
    println subfolder
}

// dir size
println "\nDir size in bytes: "
def myNewFile = new File(dir)
println myNewFile.directorySize()

// create new directories
println "\nCreate new directories: "
new File("dummy").mkdir()
new File("one/two/three").mkdirs()  //make all the parent folders

// remove directories
println "Removing newly created directories..."
new File("dummy").deleteDir()
