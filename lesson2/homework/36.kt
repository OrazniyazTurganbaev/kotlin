import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Ruh koordinatalarni kiriting ?")
    print("x1 = ")
    var x1 = scanner.nextInt()

    print("y1 = ")
    var y1 = scanner.nextInt()

    print("x2 = ")
    var x2 = scanner.nextInt()

    print("y2 = ")
    var y2 = scanner.nextInt()

    var result  = x1==x2 || y1==y2

    println("Ruh yura oladimi? : $result")
}