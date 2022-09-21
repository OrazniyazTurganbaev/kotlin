import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Koordinatalarni kiriting ?")
    print("x = ")
    var x = scanner.nextInt()

    print("y = ")
    var y = scanner.nextInt()

    print("x1 = ")
    var x1 = scanner.nextInt()

    print("y1 = ")
    var y1 = scanner.nextInt()

    print("x2 = ")
    var x2 = scanner.nextInt()

    print("y2 = ")
    var y2 = scanner.nextInt()

    var result1  = x1<x && x<x2
    var result2  = y2<y && y<y1
    var result  = result1 && result2

    println("Tortburchak ichida yotadi - shu rostmi? : $result")
}