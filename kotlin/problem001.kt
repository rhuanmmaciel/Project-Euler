// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

fun main(){

    data class Info(val r : Int){

        val numbers = (1 until 1000).toList().filter { it % r == 0 }
        val limits = Pair(numbers.first(),numbers.last())
        val n = (limits.second - limits.first)/r + 1
        val sum = (limits.first + limits.second) * n / 2

    }

    print(Info(3).sum + Info(5).sum - Info(15).sum)

}
