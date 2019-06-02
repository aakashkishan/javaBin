import java.util.*;

public class NumberOfConnectedComponents {

    public static int countConnectedComponents(int[][] edges, int n) {

        int[] root = new int[n];
        int count = n;
        // Initialize the roots of the tree nodes
        for(int i = 0; i < n; i++) {
            root[i] = i;
        }

        for(int i = 0; i < edges.length; i++) {

            int x_root = getRoot(root, edges[i][0]);
            int y_root = getRoot(root, edges[i][1]);
            if(x_root != y_root) {
                count -= 1;
                root[x_root] = y_root;
            }

        }
        return count;

    }

    public static int getRoot(int[] root, int i) {
        while(root[i] != i) {
            root[i] = root[root[i]];
            i = root[i];
        }
        return i;
    }

    public static void main(String args[]) {

        int[][] edges = new int[][] {{0, 1}, {1, 2}, {3, 4}};
        int n = 5;
        int connected_components = countConnectedComponents(edges, n);
        System.out.println("The Number of Connected Components in an Undirected Graph: " + connected_components);

    }

}





























