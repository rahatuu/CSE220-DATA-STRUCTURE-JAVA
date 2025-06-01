public class Main {
  public static void main(String[] args) {
    int[] tasks = {2, 4, 7, 1, 6};
    int m = 4;
    int[] machineLoads = new int[m];
    MinHeap heap = new MinHeap(m);
    for (int i = 0; i < m; i++) {
      heap.re_insert(new Machine(0, i));}
    for (int i = 0; i < tasks.length; i++) {
      Machine min = heap.extractMin();
      min.load += tasks[i];
      machineLoads[min.index] = min.load;
      heap.re_insert(min);}
    for (int i = 0; i < m; i++) {
      System.out.print(machineLoads[i] + " ");}}}
