import java.lang.Math.abs
import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Shoh koordinatalarni kiriting ?")
    print("x1 = ")
    var x1 = scanner.nextInt()

    print("y1 = ")
    var y1 = scanner.nextInt()

    print("x2 = ")
    var x2 = scanner.nextInt()

    print("y2 = ")
    var y2 = scanner.nextInt()

    var result  = abs(x1-x2)<=1 || abs(y1-y2)<=1

    println("Shoh yura oladimi? : $result")
}