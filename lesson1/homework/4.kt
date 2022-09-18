/*
4.	Kubtin’ tarepi berilgen. Onin’ ko’lemi V=a*a*a ha’m toliq sirtinin’ maydani S=6*a*a aniqlansin.
*/

import java.util.Scanner

fun main()
{
	val scanner : Scanner = Scanner(System.`in`)

	print("Kubtin’ tarepin kiritin’ a = ")
	var a = scanner.nextDouble()
	println()

	//Ko’lemdi esaplaw
	var V = a*a*a

	//Maydandi esaplaw
	var S = 6*a*a

	println("Kubtin’ ko’lemi V=$V")
	println("Kubtin’ maydani S=$S")
}