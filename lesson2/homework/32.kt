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

    var result1  = A*A=B*B+C*C
    var result2  = B*B=A*A+C*C
    var result3  = C*C=B*B+A*A
    var nul = A>0 && B>0 && C>0

    var result = result1 || result2 || result3 && nul

    println("Togri burchakli uchburchak - shu rostmi? : $result")
}