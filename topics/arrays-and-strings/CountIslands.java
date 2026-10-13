
class Solution {

    public int numIslands(char[][] grid) {

        // Step 1: Handle empty grid
        if (grid == null || grid.length == 0)
            return 0;

        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        // Step 2: Traverse each cell
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                // Step 3: New island found
                if (grid[r][c] == '1') {
                    islands++;

                    // Step 4: Mark all connected land
                    dfs(grid, r, c);
                }
            }
        }

        // Step 5: Return total islands
        return islands;
    }

    private void dfs(char[][] grid, int r, int c) {

        // Stop at boundary or water
        if (r < 0 || c < 0 ||
            r >= grid.length ||
            c >= grid[0].length ||
            grid[r][c] == '0') {
            return;
        }

        // Mark current land as visited
        grid[r][c] = '0';

        // Explore four directions
        dfs(grid, r - 1, c); // Up
        dfs(grid, r + 1, c); // Down
        dfs(grid, r, c - 1); // Left
        dfs(grid, r, c + 1); // Right
    }
}
