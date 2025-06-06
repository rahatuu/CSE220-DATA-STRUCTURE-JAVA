public static int maxOutDegreeMatrix(int[][] adjMatrix) {
    int max = 0;
    for (int i = 0; i < adjMatrix.length; i++) {
        int degree = 0;
        for (int j = 0; j < adjMatrix[i].length; j++) {
            if (adjMatrix[i][j] != 0) {
                degree++;
            }
        }
        if (degree > max) {
            max = degree;
        }
    }
    return max;
}
