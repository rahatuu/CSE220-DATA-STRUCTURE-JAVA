public static int maxOutDegreeList(Node[] adjList) {
    int max = 0;
    for (int i = 0; i < adjList.length; i++) {
        Node temp = adjList[i].next;
        int degree = 0;
        while (temp != null) {
            degree++;
            temp = temp.next;
        }
        if (degree > max) {
            max = degree;
        }
    }
    return max;
}
