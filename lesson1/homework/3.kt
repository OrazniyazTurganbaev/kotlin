/*
3.	Tuwritortmuyeshliktin’ tarepleri berilgen  a ha’m b berilgen. 
Onin’ maydani S=a*b ha’m P=2*(a+b) perimetri aniqlansin.
*/

import java.util.Scanner

fun main()
{
	val scanner:Scanner=Scanner(System.`in`)

	println("Tuwritortmuyeshliktin’ tarepleri a ha’m b lar kiritilsin ?")
	print("a=")
	var a=scanner.nextInt()
	println()
	
	print("b=")
	var b=scanner.nextInt()
	println()

	//Maydandi esaplaw
	var s=a*b

	//Perimetrdi esaplaw
	var p=2*(a+b)

	println("Tuwritortmuyeshliktin’ maydani S=$s")
	println("Tuwritortmuyeshliktin’ perimetri P=$p")
}