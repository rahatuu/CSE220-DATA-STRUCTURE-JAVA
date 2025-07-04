public class MinHeap {
  private int[] arr;
  private int size;

  public MinHeap(int capacity) {
    arr = new int[capacity + 1];
    size = 0;}

  public void insert(int value) {
    size++;
    arr[size] = value;
    swim(size);}

  public void swim(int idx) {
    int child = idx, parent = child / 2;
    while (parent > 0 && arr[parent] > arr[child]) {
      int temp = arr[parent];
      arr[parent] = arr[child];
      arr[child] = temp;
      child = parent;
      parent = child / 2;}}

  public void delete() {
    int temp = arr[1];
    arr[1] = arr[size];
    arr[size] = temp;
    size--;
    sink(1);}

  public void sink(int indx) {
    int parent = indx;
    while (2 * parent <= size) {
      int left = 2 * parent, right = 2 * parent + 1, small = left;
      if (right <= size && arr[right] < arr[left]) small = right;
      if (arr[parent] > arr[small]) {
        int temp = arr[parent];
        arr[parent] = arr[small];
        arr[small] = temp;
        parent = small;}
      else break;}}

  public int extractMin() {
    int min = arr[1];
    delete();
    return min;}

  public int[] sort() {
    int originalSize = size;
    for (int i = size; i > 1; i--) {
      int temp = arr[1];
      arr[1] = arr[i];
      arr[i] = temp;
      size--;
      sink(1);}
    size = originalSize;
    return arr;}

  public int[] get() {
    return arr;}
}

