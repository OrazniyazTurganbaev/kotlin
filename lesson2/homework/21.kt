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

    var result  = A <= B && B <= C && uchxs

    println("$A, $B, $C uch xonali sonning raqamlari ketma-ket osuvchi - shu rostmi? : $result")
}