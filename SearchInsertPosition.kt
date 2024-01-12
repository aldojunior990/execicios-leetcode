fun searchInsert(nums: IntArray, target: Int): Int {
    var count = 0
    for (i in nums.indices) {
        if (nums[i] == target) return i
        if (nums[i] > target) return count
        count++
    }
    return count
}


fun main() {
    val test1 = intArrayOf(1, 3, 5, 6)
    val test2 = intArrayOf(1, 3, 5, 6)

    val target1 = 7
    val target2 = 2

    println(searchInsert(test1, target1))

}