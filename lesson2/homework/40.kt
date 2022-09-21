import java.lang.Math.abs
import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Ot koordinatalarni kiriting ?")
    print("x1 = ")
    var x1 = scanner.nextInt()

    print("y1 = ")
    var y1 = scanner.nextInt()

    print("x2 = ")
    var x2 = scanner.nextInt()

    print("y2 = ")
    var y2 = scanner.nextInt()

    var result1  = abs(x1-x2) == 2 && abs(y1-y2) == 1
    var result2  = abs(x1-x2) == 1 && abs(y1-y2) == 2
    var result  = result1 || result2

    println("Ot yura oladimi? : $result")
}