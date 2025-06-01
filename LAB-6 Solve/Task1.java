// Complete the convertMirror method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 1 parameter which is root
    // You'll need to create a new Mirrored Tree and return the new root
    public static BTNode convertMirror(BTNode root ){
    if (root == null){ 
        return null;}
    else{
       BTNode lefthand = convertMirror(root.left);
       BTNode righthand = convertMirror(root.right);
       root.left = righthand;
       root.right = lefthand;
       return root; }}
    //==================================================

}
