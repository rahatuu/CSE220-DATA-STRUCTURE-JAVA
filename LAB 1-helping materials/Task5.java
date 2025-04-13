public class Task5 {
    public static int sumDist(Node head, Integer[] distArr) {
    int sum = 0;  
    int count = 0;
    Node temp = head;
    while (temp != null) {
      count++;
      temp = temp.next;}
    for (int i = 0; i < distArr.length; i++) {
      if (distArr[i] >= count) 
        continue;
      temp = head; 
      for (int j = 0; j < distArr[i]; j++) {
        temp = temp.next;}
      sum += (int)temp.elem;}
    return sum;}


    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
	System.out.print("Given LinkedList: ");
	LinkedList.printLL(head1);
	System.out.print("Distance Array: ");
	Arr.print(dist);
        System.out.println("\nExpected Output: 4");
	int returnedValue = Task5.sumDist(head1, dist);
	System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}
