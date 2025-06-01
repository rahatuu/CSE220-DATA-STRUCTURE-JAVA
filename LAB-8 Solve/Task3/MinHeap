public class MinHeap {
  Machine[] arr;
  int size;
  public MinHeap(int capacity) {
    arr = new Machine[capacity + 1];
    size = 0;}
  public void re_insert(Machine value) {
    arr[size + 1] = value;
    size++;
    swim(size);}
  public void swim(int idx) {
    int child = idx;
    int parent = child / 2;
    while (parent > 0 && arr[parent].load > arr[child].load) {
      Machine temp = arr[parent];
      arr[parent] = arr[child];
      arr[child] = temp;
      child = parent;
      parent = child / 2;}}
  public void delete() {
    arr[1] = arr[size];
    sink(1);
    size--;}
  public void sink(int indx) {
    int parent = indx;
    int left = 2 * parent;
    int right = 2 * parent + 1;
    int small;
    if (left <= size && right <= size) {
      if (arr[left].load < arr[right].load) {
        small = left;
      } else {
        small = right;}}
    else {
      return;}
    while (parent > 0 && small <= size && arr[parent].load > arr[small].load) {
      Machine temp = arr[parent];
      arr[parent] = arr[small];
      arr[small] = temp;
      parent = small;
      left = 2 * parent;
      right = 2 * parent + 1;

      if (left <= size && right <= size) {
        if (arr[left].load < arr[right].load) {
          small = left;
        } else {
          small = right;}}
      else {
        break;}}}
  public Machine extractMin() {
    Machine min = arr[1];
    delete();
    return min;}}

