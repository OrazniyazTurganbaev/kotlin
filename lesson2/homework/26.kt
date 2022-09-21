import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("x va y sonlarini kiritin ?")
    print("x = ")
    var x = scanner.nextInt()

    print("y = ")
    var y = scanner.nextInt()

    var result  = x>=0 && y<=0

    println("$x va $y koordinatalarining nuqtasi IV chorakda yotadi - shu rostmi? : $result")
}