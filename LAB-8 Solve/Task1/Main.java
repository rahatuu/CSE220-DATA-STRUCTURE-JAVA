public class Main {
  public static void main(String[] args) {
    MinHeap minHeap1 = new MinHeap(14);
    Integer[] givenArr = {null,50,40,55,87,120,28,9,300,26};
    for (int i = 0; i < givenArr.length; i++) {
      if (givenArr[i] != null) minHeap1.insert(givenArr[i]);
    }
    int[] a = minHeap1.get();
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");
    }
    System.out.println();
    minHeap1.sort();
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");}
  }
}
