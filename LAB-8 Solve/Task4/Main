class Main {
  public static void main(String[] args) {
    int[] nums = {0, 4, 10, 2, 8, 6, 7}; // 0 is placeholder for 1-based indexing
    int k = 3;
    MaxHeap maxHeap_2 = new MaxHeap(9);
    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        continue;
      } else {
        maxHeap_2.insert(nums[i]);}}
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      int top = maxHeap_2.extractMax();
      result[i] = top;}
    for (int i = 0; i < k; i++) {
      System.out.print(result[i] + " ");}}}
