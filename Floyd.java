public class Floyd {
    private static final int INF = Integer.MAX_VALUE;
    public static int getINF() {
        return INF;
    }
    public void run(int[][] graph) {
        int V = graph.length;
        int[][] dist = new int[V][V];
        for (int i = 0; i < V; i++) {
            System.arraycopy(graph[i], 0, dist[i], 0, V);
        }
        System.out.println("Исходный граф: ");
        foreach(dist);
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF &&
                            dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        System.out.printf("  %d\n", k+1);
                        System.out.printf("%d - %d = %d\n", i+1, j+1, dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
        printSolution(dist);
    }
    public void foreach(int[][] dist){
        for(int[] i : dist){
            for(int j : i){
                if (j == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.printf("%d   ",j);
                }
            }
            System.out.println();
        }
    }
    public void printSolution(int[][] dist) {
        System.out.println("Кратчайшие расстояния между всеми парами вершин:");
        foreach(dist);
    }
}
