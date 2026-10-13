
import java.util.*;

class Solution {
    public int[][] kClosest(int[][] points, int k) {

        // Step 1: Max heap - farthest point at top
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> Long.compare(distance(b), distance(a)) );

        // Step 2: Traverse all points
        for (int[] point : points) {

            // Add current point
            maxHeap.offer(point);

            // Step 3: Remove farthest when size > K
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Step 4: Extract K closest points
        int[][] result = new int[k][2];

        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }

    // Squared distance avoids expensive sqrt()
    private long distance(int[] point) {
        return (long) point[0] * point[0]  + (long) point[1] * point[1];
    }
}
