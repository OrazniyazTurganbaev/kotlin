import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Faqat butun sonlar kiritilsin?")
    print("A = ")
    var A = scanner.nextInt()

    print("B = ")
    var B = scanner.nextInt()

    var result = A % 2 != 0 && B % 2 != 0

    println("$A va $B sonlari toq sonlar - shu rostmi? : $result")
}