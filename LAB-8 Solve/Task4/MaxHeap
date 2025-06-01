class MaxHeap {
  private int[] arr;
  private int size;
  MaxHeap(int capacity) {
    arr = new int[capacity + 1];
    size = 0;}
  void insert(int value) {
    arr[size + 1] = value;
    swim(size + 1);
    size++;}
  void swim(int idx) {
    int child = idx;
    int parent = child / 2;
    while (parent > 0 && arr[parent] < arr[child]) {
      int temp = arr[parent];
      arr[parent] = arr[child];
      arr[child] = temp;
      child = parent;
      parent = child / 2;}}
  void delete() {
    int temp = arr[1];
    arr[1] = arr[size];
    arr[size] = temp;
    size--;
    sink(1);}
  void sink(int idx) {
    int parent = idx;
    int left = 2 * parent;
    int right = 2 * parent + 1;
    int greater;
    if (arr[left] > arr[right]) {
      greater = left;}
    else {
      greater = right;}
    while (parent > 0 && arr[parent] < arr[greater] && greater <= size) {
      int temp = arr[parent];
      arr[parent] = arr[greater];
      arr[greater] = temp;
      parent = greater;
      left = 2 * parent;
      right = 2 * parent + 1;
      if (left <= size && arr[left] > arr[right]) {
        greater = left;
      } else if (right <= size && arr[right] > arr[left]) {
        greater = right;}}}
  int extractMax() {
    int max = arr[1];
    delete();
    return max;}}
