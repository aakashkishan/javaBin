import java.util.*;

public class DynamicNumberOfIslands {

    public static int[] getNumberOfIslands(int[][] lands, int m, int n) {

        int[][] map = new int[m][n];
        int[] result_islands = new int[lands.length];
        for(int i = 0; i < lands.length; i++) {
            map[lands[i][0]][lands[i][1]] = 1;
            result_islands[i] = getIsland(map, m, n);
        }
        return result_islands;

    }

    public static int getIsland(int[][] map, int m, int n) {

        int island_count = 0;
        int[][] temp_map = new int[m][n];
        
        for(int i= 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                temp_map[i][j] = map[i][j];
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(map[i][j] + " ");
                if(temp_map[i][j] == 1) {
                    island_count += 1;
                    mergeIslands(temp_map, i, j, m, n);
                }
            }
            System.out.println();
        }
        System.out.println();

        return island_count;

    }

    public static void mergeIslands(int[][] temp_map, int i, int j, int m, int n) {

        if(i < 0 || i >= m || j < 0 || j >= n || temp_map[i][j] != 1) {
            return;
        }

        temp_map[i][j] = -1;
        mergeIslands(temp_map, i+1, j, m, n);
        mergeIslands(temp_map, i, j+1, m, n);
        mergeIslands(temp_map, i-1, j, m, n);
        mergeIslands(temp_map, i, j-1, m, n);

    }

    public static void main(String args[]) {

        int[][] lands = new int[][] {{1, 1}, {0, 1}, {3, 3}, {3, 4}, {3, 1}, {2, 1}, {3, 2}};
        int m = 5;
        int n = 5;
        int[] island_result = getNumberOfIslands(lands, m, n);
        System.out.println("The Number of Islands at every stage: ");
        for(int i: island_result) {
            System.out.print(i + " ");
        }

    }

}



























