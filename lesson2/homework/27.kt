import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("x va y sonlarini kiritin ?")
    print("x = ")
    var x = scanner.nextInt()

    print("y = ")
    var y = scanner.nextInt()

    var result1  = x<=0 && y>=0
    var result2  = x<=0 && y<=0
    var result  = result1 || result2

    println("$x va $y koordinatalarining nuqtasi II yoki III chorakda yotadi - shu rostmi? : $result")
}