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

    var result1 = A==(-1)*B
    var result2 = B==(-1)*C
    var result3 = A==(-1)*C

    var result  = result1 || result2 || result3

    println("$A, $B, $C sonlaridan hech bolmaganda bir jufti oz aro qarama qarshi - shu rostmi? : $result")
}