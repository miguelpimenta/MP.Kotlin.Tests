import java.lang.Thread.sleep

fun main(args: Array<String>) {

    val elements = listOf("H","E","L","L","O"," ","W","O","R","L","D"," ","I","N"," ","K","O","T","L","I","N","!!!")

    for (element in elements) {
        print(element)
        sleep(500)
    }

}