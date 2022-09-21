import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Faqat butun sonlar kiritilsin?")
    print("A = ")
    var A = scanner.nextInt()

    print("B = ")
    var B = scanner.nextInt()

    print("C = ")
    var C = scanner.nextInt()

    var result1 = A <= 0 && B > 0 && C > 0
    var result2 = A > 0 && B <= 0 && C > 0
    var result3 = A > 0 && B > 0 && C <= 0

    var result  = result1 || result2 || result3

    println("$A, $B, $C sonlaridan faqat ikkitasi musbat - shu rostmi? : $result")
}