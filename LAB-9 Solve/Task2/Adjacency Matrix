public static int maxWeightMatrix(int[][] adjMatrix) {
    int max = 0;
    for (int i = 0; i < adjMatrix.length; i++) {
        int sum = 0;
        for (int j = 0; j < adjMatrix[i].length; j++) {
            sum += adjMatrix[i][j];
        }
        if (sum > max) {
            max = sum;
        }
    }
    return max;
}

