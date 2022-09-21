import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Tenlem koeffitsiyentlerin kiritin ?")
    print("A = ")
    var A = scanner.nextInt()

    print("B = ")
    var B = scanner.nextInt()

    print("C = ")
    var C = scanner.nextInt()

    var D = B*B-4*A*C

    var result  = D>=0

    println("$D Tenglama haqiyqiy ildizlarga ega - shu rostmi? : $result")
}