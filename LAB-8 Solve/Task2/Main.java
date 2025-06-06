public class Main {
  public static void main(String[] args) {
    MaxHeap maxHeap1 = new MaxHeap(12);
    Integer[] givenArr = {null,50,40,55,87,120,28,9,300,26};
    for (int i = 0; i < givenArr.length; i++) {
      if (givenArr[i] != null) maxHeap1.insert(givenArr[i]);
    }
    int[] a = maxHeap1.get();
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.println(maxHeap1.extractMax());
    maxHeap1.sort();
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");}}}
