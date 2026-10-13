
class Solution {

    public int maxAreaOfIsland(int[][] grid) {

        // STEP 1: Check if the grid is empty.
        // No cells means no islands.
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;

        // Store largest island area found so far.
        int maxArea = 0;

        // STEP 2: Traverse every cell in the matrix.
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                // STEP 3: Start DFS only on land.
                // Water (0) or previously visited land
                // does not need further processing.
                if (grid[r][c] == 1) {

                    // Explore the full connected island.
                    // DFS returns its total area.
                    int currentArea = dfs(grid, r, c);

                    // STEP 4: Keep the largest area.
                    maxArea = Math.max(maxArea, currentArea);
                }
            }
        }

        // STEP 5: Return maximum island area.
        return maxArea;
    }

    private int dfs(int[][] grid, int r, int c) {

        // BASE CASE:
        // Stop when row or column is out of bounds,
        // or when the current cell contains water.
        if (r < 0 || r >= grid.length ||
            c < 0 || c >= grid[0].length ||
            grid[r][c] == 0) {
            return 0;
        }

        // STEP 1: Mark current land as visited.
        // Changing 1 to 0 prevents visiting it again
        // and eliminates the need for visited[][].
        grid[r][c] = 0;

        // STEP 2: Count current land cell.
        int area = 1;

        // STEP 3: Explore all 4 adjacent directions.
        // Add areas returned by neighboring DFS calls.
        area += dfs(grid, r - 1, c); // Up
        area += dfs(grid, r + 1, c); // Down
        area += dfs(grid, r, c - 1); // Left
        area += dfs(grid, r, c + 1); // Right

        // STEP 4: Return entire connected island area.
        return area;
    }
}
