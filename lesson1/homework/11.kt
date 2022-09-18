/*
11.	X kg konfet A som turadi. 1 kg ha’m Y kg konfet qansha turiwin aniqlawshi programma du’zilsin.
*/

import java.util.Scanner

fun main()
{
	val scanner : Scanner = Scanner(System.`in`)

	println("X kg konfet A som turadi. X ha’m A lardin’ manisin kiritin’ ?")
	print("X kg konfet X = ")
	var x = scanner.nextInt()

	print("$x kg konfet A som tursa, demek A somdi kiritemiz A = ")
	var a = scanner.nextInt()

	println("Y kg konfet neshe som turatuginligin kiritin’ ?")
	print("Y = ")
	var y = scanner.nextInt()

	// 1 kg konfet neshe som turatuginligin esaplaymiz
	var birKgKon = a/x
	println("1 kg konfet $birKgKon som turadi.")

	// Y kg konfetti esaplaymiz
	var yKgKon = a/x*y
	println("Y($y) kg konfet $yKgKon som turadi.")

}