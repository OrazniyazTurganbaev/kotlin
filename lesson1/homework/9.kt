/*
9.	A,B ha’m C sanlari berilgen. A nin’ ma’nisi B g’a, B nin’ ma’nisi C g’a ha’m C nin’ ma’nisi A g’a almastirilsin. A, B ha’m C nin’ taza ma’nisleri ekrang’a shig’arilsin.
*/

import java.util.Scanner

fun main()
{
	val scanner : Scanner = Scanner(System.`in`)

	println("A,B ha’m C sanlarin kiritin’ ?")

	print("A = ")
	var A = scanner.nextInt()
	println()

	print("B = ")
	var B = scanner.nextInt()
	println()

	print("C = ")
	var C = scanner.nextInt()
	println()

	var X : Int

	X = A
	A = B
	B = C
	C = X

	println("A = $A")
	println("B = $B")
	println("C = $C")

}