import java.util.Scanner

fun main()
{
    var scanner : Scanner = Scanner(System.`in`)
    println("Koordinatalarni kiriting ?")
    print("x1 = ")
    var x1 = scanner.nextInt()

    print("y1 = ")
    var y1 = scanner.nextInt()

    print("x2 = ")
    var x2 = scanner.nextInt()

    print("y2 = ")
    var y2 = scanner.nextInt()

    var result  = (x1+y1)%2==(x2+y2)%2

    println("Berilgan maydon bir xil rangda - shu rostmi? : $result")
}