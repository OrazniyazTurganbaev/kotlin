/*
12.	X kg shokolad A so’m turadi ha’m Y kg konfet B som turadi. 1kg shokolad 1 kg konfetten qansha qimbat turiwin aniqlawshi programma du’zilsin.
*/

import java.util.Scanner

fun main()
{
	val scanner : Scanner = Scanner(System.`in`)

	println("X kg shokolad kiritilsin X =")
	print("X = ")
	var x = scanner.nextInt()
	println()
	
	println("X($x) kg shokolad A so’m tursa A kiritilsin A =")
	print("A = ")
	var a = scanner.nextInt()
	println()

	println("Y kg konfet kiritilsin Y =")
	print("Y = ")
	var y = scanner.nextInt()
	println()
	
	println("B($y) kg konfet B so’m tursa B kiritilsin B =")
	print("B = ")
	var b = scanner.nextInt()
	println()

	//1 kg shokolad neshe so’m turatug’inlig’in esaplaw
	var birKgShok = a/x
	println("1 kg shokolad $birKgShok so’m turadi")

	//1 kg konfet neshe so’m turatug’inlig’in esaplaw
	var birKgKon = b/y
	println("1 kg konfet $birKgKon so’m turadi")

	var shokKonEseQim = birKgShok/birKgKon
	println("1kg shokolad 1 kg konfetten $shokKonEseQim ese qimbat turadi")
}