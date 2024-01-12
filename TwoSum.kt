class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map: MutableMap<Int, Int> = mutableMapOf()
        for (i in nums.indices) {
            val item = nums[i]
            val complemento = target - item
            if (map.containsValue(complemento)) {
                return intArrayOf(map.values.indexOf(complemento), i)
            }
            map[i] = item
        }
        return intArrayOf()
    }
}


fun main() {
    val twoSum = TwoSum()
    val nums = intArrayOf(0, 4, 3, 0)
    val target = 0
    val res = twoSum.twoSum(nums, target)
    println(res.toList().toString())
}
