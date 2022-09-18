/*
7.	Nolge ten’ bolmag’an eki san berilgen. Olardin’ jiyindisi, kobiymesi aniqlansin.
*/

import java.util.Scanner

fun main()
{
	val scanner : Scanner = Scanner(System.`in`)

	println("Nolge ten’ bolmag’an x ha’m y ti kiritin’ ?")

	print("x = ")
	var x = scanner.nextInt()
	println()

	print("y = ")
	var y = scanner.nextInt()
	println()

	//Kiritilgen san nolge ten bolsa kodti toqtatiw ushin tekseremiz

	if (x==0||y==0) {
		println("Nolge ten’ bolmag’an san kiritilsin!!")
	} else {
        //Jiyindisin esaplaw
        var S = x+y

        //Ko’beymesin esaplaw
        var K = x*y
		println("Olardin’ jiyindisi x+y = $S")
		println("Olardin’ ko’beymesi x*y = $K")
	}
}