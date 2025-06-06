public static int maxWeightList(Node[] adjList) {
    int max = 0;
    for (int i = 0; i < adjList.length; i++) {
        Node temp = adjList[i].next;
        int sum = 0;
        while (temp != null) {
            sum += Integer.parseInt(temp.elem);
            temp = temp.next;
        }
        if (sum > max) {
            max = sum;
        }
    }
    return max;
}
