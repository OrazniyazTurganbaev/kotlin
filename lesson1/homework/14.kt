/*
14.	Tashkent ha’m No’kis qalalari arasinda araliq S km. Matiz avtomobili bul araliqti 25 saatta basip o’tti. Matiz avtomobilinin’ ortasha tezligin aniqlawshi programma du’zilsin.
*/

import java.util.Scanner

fun main()
{
	val scanner : Scanner = Scanner(System.`in`)

	print("Tashkent ha’m No’kis qalalari arasinda araliq kiritilsin S(Km) = ")
	var S = scanner.nextDouble()

	//Ortasha tezlikti tabiw V = S/t
	val t : Int = 25
	var V = S/t

	println("Matiz avtomobilinin’ ortasha tezligi V(Km/s) = $V")
}