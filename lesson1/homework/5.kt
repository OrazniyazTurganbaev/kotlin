/*
5.	Paralelepipedtin’ tarepleri a,b,c berilgen. 
Onin’ ko’lemi V=a*b*c ha’m toliq sirti S=2*(a*b+b*c+a*c) aniqlansin.
*/

import java.util.Scanner

fun main()
{
	val scanner : Scanner = Scanner(System.`in`)

	println("Paralelepipedtin’ tarepleri a,b,c lar kiritilsin ?")
	print("a = ")
	var a = scanner.nextInt()
	println()
	
	print("b = ")
	var b = scanner.nextInt()
	println()
	
	print("c = ")
	var c = scanner.nextInt()
	println()

	//Kolemdi esaplaw
	var V = a*b*c

	//Toliq sirtin esaplaw
	var S = 2*(a*b+b*c+a*c)
	
	println("Paralelepipedtin’ ko’lemi V=$V")
	println("Paralelepipedtin’ toliq sirti S=$S")
}