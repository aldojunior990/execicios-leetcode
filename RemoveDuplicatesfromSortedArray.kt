fun removeDuplicates(nums: IntArray): Int {
    val unique = mutableListOf<Int>()
    var count = 0
    for (i in nums.indices) {
        val element = nums[i]
        if (!unique.contains(element)) {
            unique.add(element)
            nums[count] = element
            count++
        }
    }
    return unique.size
}

fun main() {
    var nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val count = removeDuplicates(nums)
    println(count)
}