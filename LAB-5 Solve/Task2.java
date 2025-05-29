import java.util.Arrays;
import java.util.Random;

public class Task2 {

    // Task 2A: Print elements of an array using a loop
    public static void task2A(int[] arr) {
        int count=0;
        while(count<arr.length){
          System.out.print(arr[count]+" ");
          count++;}
    }

    // Task 2B: Print elements of an array using recursion
    public static void task2B_recursive(int[] arr, int i) {
      if (i==arr.length || i>arr.length){
        return;}
      System.out.print(arr[i]+" ");
      task2B_recursive(arr,i+1);
    }

    // Task 2C: Return the sum of array elements using a loop
    public static int task2C(int[] arr) {
        int addition=0;
        int count=0;
        while(count<arr.length){
          addition+=arr[count];
          count++;}
        return addition;
    }

    // Task 2D: Return the sum of array elements using recursion
    public static int task2D_recursive(int[] arr, int i) {
      if (i>arr.length || i==arr.length){
        return 0;}
      return arr[i]+task2D_recursive(arr,i+1);
    }

    // Task 2E: Return (product of odd) - (sum of even) using loop
    public static int task2E(int[] arr) {
        int count=0;
        int odd_mul=1;
        int even_sum=0;
        while(count<arr.length){
          if(arr[count]%2==0){
            even_sum+=arr[count];}
          else{odd_mul*=arr[count];}
          count++;}
        return odd_mul-even_sum;
    }

    // Task 2F: Return (product of odd) - (sum of even) using recursion
    public static int task2F_recursive(int[] arr) {
      return odd_mul(arr, 0)-even_sum(arr, 0);}
    
    public static int even_sum(int[] arr, int count) {
      if (count == arr.length){return 0;}
      if (arr[count] % 2 == 0) {
        return arr[count] + even_sum(arr, count + 1);}
      else {
        return even_sum(arr, count + 1);}}
    
    public static int odd_mul(int[] arr, int count) {
        if (count == arr.length) return 1;
        if (arr[count] % 2 != 0) {
          return arr[count] * odd_mul(arr, count + 1);}
        else {
          return odd_mul(arr, count + 1);}}
        
      

    //DRIVER CODE
    public static void main(String[] args) {
        // Driver code for testing Task 2 methods
        // task2A
        System.out.println("\n Task2A ");
        int[] arr = generateRandomArray(6, 1, 20);
        System.out.println("Expected Output: "+Arrays.toString(arr));
        System.out.print("Your Output    : ");
        task2A(arr);
        System.out.println();

        // task2B_recursive
        System.out.println("\n Task2B ");
        System.out.println("Expected Output: "+Arrays.toString(arr));
        System.out.print("Your Output    : ");
        task2B_recursive(arr, 0);
        System.out.println();

        System.out.println("\n----------------------------");

        // task2C
        System.out.println("\n Task2C ");
        arr = new int[]{3,2,45,1,2,52};
        System.out.println("The Array: "+Arrays.toString(arr));
        System.out.println("Expected Output: "+105);
        System.out.print("Your Output    : "+task2C(arr));
        System.out.println();

        // task2D_recursive
        System.out.println("\n Task2D ");
        System.out.println("The Array: "+Arrays.toString(arr));
        System.out.println("Expected Output: "+105);
        System.out.print("Your Output    : "+task2D_recursive(arr, 0));

        System.out.println("\n----------------------------");

        // task2E
        System.out.println("\n Task2E ");
        arr = new int[]{3,5,8,3,2};
        System.out.println("The Array: "+Arrays.toString(arr));
        System.out.println("Expected Output: "+35);
        System.out.print("Your Output    : "+task2E(arr));
        System.out.println();

        // task2F_recursive
        System.out.println(" \nTask2F ");
        System.out.println("The Array: "+Arrays.toString(arr));
        System.out.println("Expected Output: "+35);
        System.out.print("Your Output    : "+task2F_recursive(arr));

        System.out.println("\n----------------------------");
    }

    //helper methods
    public static int[] generateRandomArray(int size, int start, int end) {
        if (start > end)
            throw new IllegalArgumentException("Start value must be less than or equal to end value.");
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = rand.nextInt(end - start + 1) + start;
        return arr;
    }
    
}
