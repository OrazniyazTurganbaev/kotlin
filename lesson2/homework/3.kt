import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Butun son kiritilsin?")
    print("A = ")
    var A = scanner.nextInt()

    var result = A % 2 == 0

    println("$A juft sonmi? - $result")
}