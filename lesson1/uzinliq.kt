import java.util.Scanner

fun main()
{
    val scanner : Scanner = Scanner(System.`in`)
    println("x1 uzinliqti kiritin ?")
    val x1 = scanner.nextInt()
    println("x2 uzinliqti kiritin ?")
    val x2 = scanner.nextInt()

    val sani = x1/x2

    println("birinshi uzinliqqa ekinshi uzinliqtan $sani wi jaygasadi")
}