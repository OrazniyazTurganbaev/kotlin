import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Musbat son kiritilsin?")
    print("M = ")
    var M = scanner.nextInt()

    var result1 = M > 9 && M < 100
    var result2 = M % 2 == 0

    var result  = result1 && result2

    println("$M soni ikki xonali juft son - shu rostmi? : $result")
}