// Complete the sumOfLeaves method    
    public class Task4 {
    
    //===================================TASK#4======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
        public static Integer mirrorSum(BSTNode root) {
            if (root == null) {
                return 0;}
            return Helper(root.left, root.right);}
        private static Integer Helper(BSTNode left, BSTNode right) {
            if (left == null || right == null) {
                return 0;}
            return left.elem + right.elem+Helper(left.left, right.right)+Helper(left.right, right.left);}
    
    }
    

