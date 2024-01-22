fun plusOne(digits: IntArray): IntArray {
    var result = IntArray(digits.size)
    var i = (digits.size - 1)
    var ci = 1
    while (i >= 0) {
        val sum = ci + digits[i]
        if (sum > 9) {
            val rest = sum - 10
            result[i] = rest
        } else {
            ci = 0
            result[i] = sum
        }
        i -= 1
    }
    if (i == -1 && ci == 1) {
        val newResult = IntArray(result.size + 1)
        newResult[0] = ci
        System.arraycopy(result, 0, newResult, 1, result.size)
        result = newResult
    }


    println(result.toMutableList())
    return result
}

fun main() {
    plusOne(intArrayOf(1, 2, 3))
    plusOne(intArrayOf(4, 3, 2, 1))
    plusOne(intArrayOf(9))
    plusOne(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0))
}