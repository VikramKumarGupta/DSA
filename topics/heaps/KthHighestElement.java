import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {

        // Step 1: Min heap stores K largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Step 2: Traverse all elements
        for (int num : nums) {
            // Add current element to heap
            minHeap.offer(num);

        // Step 3: Remove smallest if size exceeds K
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 4: Root is the Kth largest element
        return minHeap.peek();
    }
}
