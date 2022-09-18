import java.util.*

fun main()
{
    val scanner : Scanner = Scanner(System.`in`)
    println("Bes xanali san kiritin ?")
    var a = scanner.nextInt();

    var birinshi = a / 10000
    var ekinshi = (a % 10000) / 1000
    var ushinshi = ((a % 10000) % 1000) / 100
    var tortinshi = (((a % 10000) % 1000) % 100) / 10
    var besinshi = a % 10

    println("Birinshi = $birinshi")
    println("Ekinshi = $ekinshi")
    println("Ushinshi = $ushinshi")
    println("Tortinshi = $tortinshi")
    println("Besinshi = $besinshi")

    var summ = birinshi+ekinshi+ushinshi+tortinshi+besinshi

    println("Summasi := $summ")
}