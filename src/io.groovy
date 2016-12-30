/**
 * Created by ka on 12/13/16.
 */
println "Please enter your favorite sports team: "

String team
System.in.withReader { reader ->
    team = reader.readLine()
}
println "Your fave team is the: $team."
