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
    var up = A <= B && B <= C
    var down = A >= B && B >= C

    var result  = (up || down) && uchxs

    println("$A, $B, $C uch xonali sonning raqamlari ketma-ket osuvchi yoki kamayuvchi - shu rostmi? : $result")
}