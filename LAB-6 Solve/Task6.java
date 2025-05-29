public class Task6 {
    public static Integer levelSum( BTNode root ){
        return helper(root, 0);}
    private static Integer helper(BTNode root, int level){
        if (root == null) return 0;
        else{
            Integer left = helper(root.left, level+1);
            Integer right = helper(root.right, level+1);
            if (level%2 == 0){
                return left + right -(Integer)root.elem;}
            else{
                return left + right + (Integer)root.elem;}}}
}