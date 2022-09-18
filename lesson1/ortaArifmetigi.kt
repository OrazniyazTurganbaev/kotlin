import java.util.Scanner

fun main()
{
    val scanner : Scanner = Scanner(System.`in`)

    println("a sanin kiritin ?")
    val a = scanner.nextDouble()
    println("b sanin kiritin ?")
    val b = scanner.nextDouble()
    val ortaArifmetik = (a+b)/2

    println("Eki sannin orta arifmetigi = $ortaArifmetik ")

}