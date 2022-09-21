import java.lang.Math.abs
import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Fil koordinatalarni kiriting ?")
    print("x1 = ")
    var x1 = scanner.nextInt()

    print("y1 = ")
    var y1 = scanner.nextInt()

    print("x2 = ")
    var x2 = scanner.nextInt()

    print("y2 = ")
    var y2 = scanner.nextInt()

    var result1  = x1-x2==y1-y2
    var result2  = abs(x1-x2) == abs(y1-y2)
    var result  = result1 || result2 || x1==x2 || y1==y2
 
    println("Fil yura oladimi? : $result")
}