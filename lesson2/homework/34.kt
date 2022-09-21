import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("x va y sonlarini kiritin ?")
    print("x = ")
    var x = scanner.nextInt()

    print("y = ")
    var y = scanner.nextInt()

    var result  = (x+y)%2==0

    println("Berilgan maydon oq - shu rostmi? : $result")
}