// Complete the subtractSummation method
public class Task5 {
   public static Integer subtractSummation(BTNode root) {
        return subtreeSum(root.left) - subtreeSum(root.right);}
    private static Integer subtreeSum(BTNode root) {
        if (root == null) return 0;
        return (Integer) root.elem + subtreeSum(root.left) + subtreeSum(root.right);}
}