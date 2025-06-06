
public static Node createList(String[] arr) {
    Node head = new Node(arr[0]);
    Node tail = head;
    for (int i = 1; i < arr.length; i++) {
        if (!arr[i].equals("0")) {
            Node newNode = new Node(arr[i]);
            tail.next = newNode;
            tail = newNode;
        }
    }
    return head;
}
public static int maxDegreeList(Node[] adjList) {
    int max = 0;
    for (int i = 0; i < adjList.length; i++) {
        Node temp = adjList[i];
        int degree = -1;
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
