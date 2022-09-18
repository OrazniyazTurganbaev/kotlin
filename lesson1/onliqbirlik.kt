import java.util.Scanner

fun main()
{
    val scanner : Scanner = Scanner(System.`in`)
    println("Onliq san kiritin")
    val onliqSan = scanner.nextInt()
    val birlik = onliqSan/10
    val onliq = onliqSan%10
    println("Birlik san $onliq")
    println("Onliq san $birlik")
}