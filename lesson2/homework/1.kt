import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Butun son kiritilsin?")
    print("A = ")
    var A = scanner.nextInt()

    var result = A > 0

    println("$A soni musbatmi? - $result")
}