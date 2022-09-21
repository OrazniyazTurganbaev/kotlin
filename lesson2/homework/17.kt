import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Musbat son kiritilsin?")
    print("M = ")
    var M = scanner.nextInt()

    var result1 = M > 99 && M < 1000
    var result2 = M % 2 != 0

    var result  = result1 && result2

    println("$M soni uch xonali toq son - shu rostmi? : $result")
}