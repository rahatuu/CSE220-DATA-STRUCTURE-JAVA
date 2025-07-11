// Complete the sumOfLeaves method
public class Task3 {

    //===================================TASK#3======================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is the sum initiliazed as 0
    // You'll need to return the sum of the leaf nodes
    public static Integer sumOfLeaves( BSTNode root, Integer sum ){
        if(root == null) {
            return sum;}
        if(root.left == null && root.right == null) {
            sum += root.elem;}
        else {
            if(root.left != null) {
                sum = sumOfLeaves(root.left, sum);}
            if(root.right != null) {
                sum = sumOfLeaves(root.right, sum);}}
        return sum; }
}
