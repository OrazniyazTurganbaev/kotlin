/*
10.	Temperatura Farangeytde berilgen. Temperatura ma’nisi gradus selsiyge o’tkeriwshi programma du’zilsin. Tc = (Tf - 32)*5/9
*/

import java.util.Scanner

fun main()
{
	val scanner : Scanner = Scanner(System.`in`)

	println("Farangeytte berilgen temperaturani kiritin’ ?")
	print("Tf = ")
	var Tf = scanner.nextDouble()

	//Temperatura ma’nisin gradus selsiyge esaplaw
	var Tc = (Tf-32)*5/9
	print("Farangeyt temperaturasi celsiyde Tc = $Tc")
}