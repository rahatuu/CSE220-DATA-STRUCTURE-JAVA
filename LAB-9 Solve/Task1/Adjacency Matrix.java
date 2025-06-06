public static int maxDegreeMatrix(int[][] adjMatrix) {
    int max = 0;
    for (int i = 0; i < adjMatrix.length; i++) {
        int tempSum = 0;
        for (int j = 0; j < adjMatrix[i].length; j++) {
            if (adjMatrix[i][j] != 0) {
                tempSum++;
            }
        }
        if (tempSum > max) {
            max = tempSum;
        }
    }
    return max;}
