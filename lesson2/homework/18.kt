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

    var result1 = A == B && B != C
    var result2 = A == C && C != B
    var result3 = B == C && C != A

    var result  = result1 || result2 || result3

    println("$A, $B, $C sonlaridan hech bolmaganda ikitasi bir biriga teng - shu rostmi? : $result")
}