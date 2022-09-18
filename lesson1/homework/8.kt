/*
8.	A ha’m B sanlari berilgen. Berilgen eki sannin’ ma’nisi bir biri menen almastirilsin.
*/

import java.util.Scanner

fun main()
{
	val scanner : Scanner = Scanner(System.`in`)

	println("A ha’m B sanlarin kiritin’ ?")

	print("A = ")
	var A = scanner.nextInt()
	println()

	print("B = ")
	var B = scanner.nextInt()
	println()

	var X : Int

	X = A
	A = B
	B = X

	println("A = $A")
	println("B = $B")
}