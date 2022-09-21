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

    var result = (A < B && B < C)||(C < B && B < A)

    println("$B soni $A va $C sonlari orasida yotadi - shu rostmi? : $result")
}
