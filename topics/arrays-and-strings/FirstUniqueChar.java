
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {

    public int firstUniqChar(String s) {

        // STEP 1: Build character frequency map.
        Map<Character, Long> freq = s.chars()

            // Convert int values to Character objects.
            .mapToObj(c -> (char) c)

            // Group characters and count occurrences.
            .collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            ));

        // STEP 2: Stream over original indexes.
        return java.util.stream.IntStream
            .range(0, s.length())

            // Keep indexes with frequency equal to 1.
            .filter(i -> freq.get(s.charAt(i)) == 1)

            // First matching index.
            .findFirst()

            // Return -1 if no unique character exists.
            .orElse(-1);
    }
}
