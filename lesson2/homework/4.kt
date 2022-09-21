import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Faqat butun sonlar kiritilsin?")
    print("A = ")
    var A = scanner.nextInt()

    print("B = ")
    var B = scanner.nextInt()

    var result = A>2 && B<=3

    println("$A > 2 va $B <= 3 - shu rostmi? : $result")
}