class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.isEmpty()) {
        return null
    }

    return balance(nums, 0, nums.size - 1)
}


fun balance(nums: IntArray, left: Int, right: Int): TreeNode? {
    if (left > right) {
        return null
    }

    val mid = left + (right - left) / 2
    val root = TreeNode(nums[mid])

    root.left = balance(nums, left, mid - 1)
    root.right = balance(nums, mid + 1, right)

    return root
}

fun main() {
}