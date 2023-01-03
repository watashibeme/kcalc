import java.util.*
fun main()
{
    //type conversion by type mention
    /*
    val x:Int = 5
    val y: Long = x.toLong()
    println(y)
    */
    //operators
    //basic sum operator

    /*
    var sum = 100 + 50
    println(sum)
    */

    //calculator using scanner
    val reader = Scanner(System.`in`)
    print("Enter two numbers: ")

    // nextDouble() reads the next double from the keyboard
    val first = reader.nextDouble()
    val second = reader.nextDouble()

    print("Enter an operator (+, -, *, /): ")
    val operator = reader.next()[0]

    val result: Double = when (operator) {
        '+' -> first + second
        '-' -> first - second
        '*' -> first * second
        '/' -> first / second
        // operator doesn't match any case constant (+, -, *, /)
        else -> {
            System.out.printf("Error! operator is not correct")
            return
        }
    }

    System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result)
}
