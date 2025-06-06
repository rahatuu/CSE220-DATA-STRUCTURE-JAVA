public static int[][] convertToUndirectedMatrix(int[][] adjMatrix) {
    int[][] undirected = new int[adjMatrix.length][adjMatrix.length];
    for (int i = 0; i < adjMatrix.length; i++) {
        for (int j = 0; j < adjMatrix[i].length; j++) {
            if (adjMatrix[i][j] != 0) {
                undirected[i][j] = adjMatrix[i][j];
                undirected[j][i] = adjMatrix[i][j];
            }
        }
    }
    return undirected;
}
