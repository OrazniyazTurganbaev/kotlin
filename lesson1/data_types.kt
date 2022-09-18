import java.util.Scanner

fun main()
{
    var byteNumber : Byte = -128
    var byteNumber2 : Byte = 127
    var shortNumber : Short = 32000
    var intNumber : Int = 2800000
    var longNumber : Long = 9000000000L
    var double : Double = 13.14
    var float : Float = 35.36F
    var float2 : Float = 355.02f


    println(byteNumber)
    println(byteNumber2)
    print("shortnumber: = $shortNumber")
    println()
    println(float/float2)

    var a = 0.5
    var b = 0.6
    var qosiw = a + b
    var aliw = a - b
    var kobeytiw = a * b
    var boliw = a / b
    var qaldiq = 8 % 3

    println("---------")
    println("Qosiw := $qosiw")
    println("Aliw := $aliw")
    println("Kobeytiw := $kobeytiw")
    println("Boliw := $boliw")
    println("Qaldiq := $qaldiq")
    println("---------")


    println("Putin eki san kiritin ?")

    val scanner : Scanner = Scanner(System.`in`)
    var san1 = scanner.nextDouble()
    var san2 = scanner.nextDouble()


     qosiw = san1 + san2
     aliw = san1 - san2
     kobeytiw = san1 * san2
     boliw = san1 / san2
     var qaldiq1 = san1 % san2

    println("---------")
    println("Qosiw := $qosiw")
    println("Aliw := $aliw")
    println("Kobeytiw := $kobeytiw")
    println("Boliw := $boliw")
    println("Qaldiq := $qaldiq1")
    println("---------")

}