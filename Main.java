public class Main {
    public static void main(String[] args) {
        int INF = Floyd.getINF();
        int[][] graph = {
                {0, 1, INF, 2, 3},
                {1, 0, 1, INF, INF},
                {INF, 1, 0, 4, INF},
                {2, INF, 4, 0, 5},
                {3, INF, INF, 5, 0}
        };
        Floyd floyd = new Floyd();
        floyd.run(graph);
    }
}
