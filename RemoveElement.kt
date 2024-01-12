fun removeElement(nums: IntArray, `val`: Int): Int {
    var count = 0
    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[count] = nums[i]
            count++
        }
    }
    return count
}

fun main() {
    val nums = intArrayOf(3, 2, 2, 3)
    val value = 3
    val size = removeElement(nums, value)
}