import java.util.Scanner;

public class Task1 {

    // Task 1A: Print numbers from 1 to 10 using a loop
    public static void task1A() {
      int count=1;
      while (count<11){
        System.out.print(count+" ");
        count++;}
      System.out.println();
    }

    // Task 1B: Print numbers from 1 to 10 using recursion
    public static void task1B_recursive(int i) {
      if (i>10){
        return;}
      System.out.print(i+" ");
      task1B_recursive(i+1);
    }

    // Task 1C: Print numbers from 1 to n using a loop
    public static void task1C(int n) {
      int count=1;
      while (count<n+1){
        System.out.print(count+" ");
        count++;}
      System.out.println();
    }

    // Task 1D: Print numbers from 1 to n using recursion
    public static void task1D_recursive(int i, int n) {
      if (i>n){
        return;}
      System.out.print(i+" ");
      task1D_recursive(i+1,n);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task1A();
        task1B_recursive(1);
        task1C(sc.nextInt());
        task1D_recursive(1,sc.nextInt());

        sc.close();
    }
}
