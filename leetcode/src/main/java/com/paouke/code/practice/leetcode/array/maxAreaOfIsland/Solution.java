package com.paouke.code.practice.leetcode.array.maxAreaOfIsland;

public class Solution {
    int[][] grid;
    boolean[][] reg;

    public int area(int r, int c) {
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || reg[r][c] || grid[r][c] == 0) {
            return 0;
        }
        reg[r][c] = true;
        return (1 + area(r - 1, c) + area(r + 1, c) + area(r, c - 1) + area(r, c + 1));
    }

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        int max = 0;
        reg = new boolean[grid.length][grid[0].length];
        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {
                max = Math.max(max, area(r, c));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] grid = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                         { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                         { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
                         { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
        System.out.println(new Solution().maxAreaOfIsland(grid));
    }
}
