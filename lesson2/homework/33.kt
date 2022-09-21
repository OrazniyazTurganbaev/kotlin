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

    var result1  = A<B+C
    var result2  = B<A+C
    var result3  = C<B+A

    var result = result1 && result2 && result3

    println("Uchburchak yasash mumkin - shu rostmi? : $result")
}