/**
 *
 * Lexilyer for COSC 455
 * by Wesley Lancaster
 * Submitted on 10/20/22
 * wlanca2@students.towson.edu
 * https://github.com/weslanstr/lexicalAnalyzerKotlin
 *
 **/

import java.io.File
import kotlin.system.exitProcess
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {









    //TODO 1 initialization
    /*
    initialize file reader called file
    object to hold file.txt file
    var x: String = " "
    x = readLine()
    println(x)

    println("\n|\nplease enter directory location of .txt file.....");
    *read input
    *store input
    print(".....path entered");
    if(file.exist()){} else{print(".....file doesnt exist")}
    println("|");
    */

    //sample location: /Users/johnmetz/Desktop/cosc455/455KOTLIN/project1Kotlin/Examples/ab.txt

    println("""|
    * Lexilyzer for COSC 455
    * by Wesley Lancaster
    * Submitted on 10/??/22""")
    println("\n|\nplease enter directory location of .txt file.....");
    val name: String = readLine()!!
    println("You entered: $name")
    print(".....path entered")

    val x = File(name)
    if (x.exists()) {
        print(""".....${x.name} exists!""")
    } else {
        println("......file does not exist")
        exitProcess(1)
    }
    println("|")









    //TODO 2 the main loop
    try {
        Files.lines(Paths.get(name)).use {stream -> stream.forEach { println(it) }}
    } catch (e: IOException) {
        e.printStackTrace()
    }

    print("""|
end of text file
|
    * Lexilyzer for COSC455
    * by Wesley Lancaster
    * Submitted on 10/??/22
|""");









    //TODO 3 next function
    fun next(){    }

    //TODO 4 position function
    fun position(x:Int){    }

    //TODO 5 kind function
    fun kind(){    }

    //TODO 6 value function
    fun value(){    }
}