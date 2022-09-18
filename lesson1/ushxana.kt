import java.util.*

fun main()
{
    val scanner : Scanner = Scanner(System.`in`)
    println("Ush xanali san kiritin ?")
    var a = scanner.nextInt();

    var birinshi = a/100
    var ekinshi = a%100/10
    var ushinshi = a%10

    println("Birinshi = $birinshi")
    println("Ekinshi = $ekinshi")
    println("Ushinshi = $ushinshi")

    var natiyje = ushinshi*100+ekinshi*10+birinshi

    println("Natiyje := $natiyje")
}