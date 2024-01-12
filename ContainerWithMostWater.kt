import kotlin.math.min

fun maxArea(height: IntArray): Int {
    val map: Map<Int, Int> = mutableMapOf()

    var delta: Int = 0
    var left: Int = 0
    var right: Int = 0
    var amount: Int = 0
    for (i in height.indices) {
        if (i == 0) {
            right = 1
            amount = 1 * min(height[0], height[1])
            break
        }

    }

    println(amount)

    return 0
}

fun main() {
    val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)

    maxArea(height)
}