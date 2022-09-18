/*
6.	Eki san berilgen. Olardin’ orta arifmetigi aniqlansin (a+b)/2
*/

import java.util.Scanner

fun main()
{
	val scanner : Scanner = Scanner(System.`in`)

	println("a ha’m b sanlarin kiritin’ ?")

	print("a = ")
	var a = scanner.nextDouble()
	println()

	print("b = ")
	var b = scanner.nextDouble()
	println()

	//Olardin’ orta aifmetigin esaplaw

	var OrtaArif = (a+b)/2

	println("Olardin’ orta arifmetigi $OrtaArif ke ten’.")
}