fun main()
{
    var a = 5
    var b = 4
    var c = 3

    println("a = $a")
    println("b = $b")
    println("c = $c")

    println("-------------------------")

    var x = a
    a = b
    b = c
    c = x

    println("a = $a")
    println("b = $b")
    println("c = $c")
}