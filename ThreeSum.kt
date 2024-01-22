fun threeSum(nums: IntArray): List<List<Int>> {
    val sorted = nums.sorted()

    val result = mutableListOf<List<Int>>()
    for (i in sorted.indices) {
        val index = sorted[i]
        val target = index * (-1)
        val indexArray = mutableListOf(index)
        val map: MutableMap<Int, Int> = mutableMapOf()
        var init = i + 1
        var limit = sorted.size - 1
        while (init <= limit) {
            val mid = (init + limit) / 2
            val complemento = target - sorted[mid]
            if (map.containsValue(complemento)) {
                indexArray.add(sorted[map.values.indexOf(complemento)])
                indexArray.add(mid)
            }
            
        }

        if (indexArray.size == 3) result.add(indexArray)


    }


    /*for (i in nums.indices) {
        val item = nums[i]
        val complemento = targets[i] - item
        if (map.containsValue(complemento)) {
            println(complemento)
        }
        map[i] = item
    }*/

    return listOf()
}

fun main() {
    val nums = intArrayOf(-1, 0, 1, 2, -1, -4)

    threeSum(nums)
}