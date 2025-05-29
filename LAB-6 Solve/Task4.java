public class Task4 {

//    public static void swapChild(BTNode root, int lvl, int M) {
//      if (root == null){
//        return;}
//      if (lvl >= M) {
//        return;}
//      BTNode temp = root.left;
//      root.left = root.right;
//      root.right = temp;
//      swapChild(root.left, lvl + 1, M);
//      swapChild(root.right, lvl + 1, M);}
  public static void swapChild(BTNode root, int lvl, int M) {
    swapChildHelper(root, lvl, M); }
  public static void swapChildHelper(BTNode root, int lvl, int M) {
            if (root == null) {
              return;}
            if (lvl >= M) {
              return;}
            BTNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            swapChildHelper(root.left, lvl + 1, M);
            swapChildHelper(root.right, lvl + 1, M);}
}
