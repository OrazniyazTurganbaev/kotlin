/*
13. A ha’m B koeffitsientleri berilgen, A*x+B = 0 siziqli ten’lemenin’ sheshimin aniqlaytug’in programma du’zilsin.
*/

import java.util.Scanner

fun main()
{
	val scanner : Scanner = Scanner(System.`in`)

	println("A*x+B = 0 siziqli ten’lemenin’ sheshimin aniqlaw ?")
	
	print("A = ")
	var a = scanner.nextInt()
	
	print("B = ")
	var b = scanner.nextInt()

	var x : Int

	if(a==0){
		if(b!=0){
			println("Sheshimi joq!!")
		}else{
			println("Qalegen sheshim.")
		}
	}else{
		x = (-1)*b/a
		println("X = $x")
	}
}