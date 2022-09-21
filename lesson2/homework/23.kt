import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Uch xonali son kiritilsin?")
    print("X = ")
    var X = scanner.nextInt()

    var A = X/100
    var B = X%100/10
    var C = X%10

    var uchxs = X > 99 && X <1000

    var left = A*100+B*10+C
    var right = C*100+B*10+A

    var result  = (left == right) && uchxs

    println("$A, $B, $C uch xonali sonning raqamlari chaptan va ongdan oqiganda bir xil - shu rostmi? : $result")
}