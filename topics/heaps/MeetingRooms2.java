
import java.util.*;

class Solution {
    public int minMeetingRooms(int[][] intervals) {

        // Step 1: Sort meetings by start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // Step 2: Min heap stores meeting end times
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Step 3: Process each meeting
        for (int[] meeting : intervals) {
            // Reuse room if earliest meeting has ended
            if (!minHeap.isEmpty() && meeting[0] >= minHeap.peek()) {
                minHeap.poll();
            }
            // Allocate or reuse a room
            minHeap.offer(meeting[1]);
        }

        // Step 4: Return required room count
        return minHeap.size();
    }
}
