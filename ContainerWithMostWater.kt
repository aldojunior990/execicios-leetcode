import kotlin.math.max
import kotlin.math.min

fun maxArea(height: IntArray): Int {
    var amount = 0
    var left = 0
    var right = height.size - 1

    while (left < right) {
        if (height[left] < height[right]) {
            amount = max(amount, height[left] * (right - left))
            left += 1
        } else {
            amount = max(amount, height[right] * (right - left))
            right -= 1
        }
    }
    return amount
}

fun main() {
    val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)

    maxArea(height)
}