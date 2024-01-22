fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var k = 0
    var i = 0
    var j = 0
    val aux = nums1.copyOfRange(0, m)
    while (i < m && j < n) {
        if (aux[i] <= nums2[j]) {
            nums1[k] = aux[i]
            i++
            k++
        } else {
            nums1[k] = nums2[j]
            j++
            k++
        }
    }
    while (i < m) {
        nums1[k] = aux[i]
        i++
        k++
    }
    while (j < n) {
        nums1[k] = nums2[j]
        j++
        k++
    }
}

fun main() {
    merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
}