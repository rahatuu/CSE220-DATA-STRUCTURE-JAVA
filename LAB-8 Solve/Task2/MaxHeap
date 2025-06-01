public class MaxHeap {
  private int[] arr;
  private int size;
  public MaxHeap(int capacity) {
    arr = new int[capacity + 1];
    size = 0;}
  public void insert(int value) {
    size++;
    arr[size] = value;
    swim(size);}
  public void swim(int idx) {
    int child = idx, parent = child / 2;
    while (parent > 0 && arr[parent] < arr[child]) {
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
    int left = 2 * parent, right = 2 * parent + 1, greater = 0;
    if (right <= size) {
      if (arr[left] > arr[right]) greater = left;
      else greater = right;}
    else if (left <= size) {greater = left;}
    while (parent > 0 && greater <= size && arr[parent] < arr[greater]) {
      int temp = arr[parent];
      arr[parent] = arr[greater];
      arr[greater] = temp;
      parent = greater;
      left = 2 * parent;
      right = 2 * parent + 1;
      if (right <= size) {
        if (arr[left] > arr[right]) greater = left;
        else greater = right;}
      else if (left <= size) {greater = left;}
      else break;}}
  public int extractMax() {
    int max = arr[1];
    delete();
    return max;}
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
    return arr;}}
