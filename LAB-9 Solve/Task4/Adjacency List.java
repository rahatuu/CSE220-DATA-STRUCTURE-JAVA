public static Node[] convertToUndirectedList(Node[] adjList) {
    Node[] undirected = new Node[adjList.length];
    for (int i = 0; i < adjList.length; i++) {
        Node temp = adjList[i];
        undirected[i] = new Node(temp.elem);
        temp = temp.next;
        while (temp != null) {
            String val = temp.elem;
            Node newNode = new Node(val);
            newNode.next = undirected[i].next;
            undirected[i].next = newNode;

            int dest = Integer.parseInt(val);
            Node reverse = new Node("" + i);
            reverse.next = undirected[dest] == null ? null : undirected[dest].next;
            Node head = new Node("" + dest);
            head.next = reverse;
            undirected[dest] = head;
            temp = temp.next;
        }
    }
    return undirected;
}
