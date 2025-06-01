// Complete the sumOfLeaves method
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath(BSTNode root, Integer key) {
      Boolean found = false; 
      String path = "";
        if (root == null) {
          return "No Path Found";}
        if (root.elem > key) {
            path += root.elem + " ";
            String leftPath = findPath(root.left, key);
            if (leftPath.equals("No Path Found")) {
              return "No Path Found";}
              path += leftPath;}
        else if (root.elem < key) {
            path += root.elem + " ";
            String rightPath = findPath(root.right, key);
            if (rightPath.equals("No Path Found")) {
               return "No Path Found";}
               path += rightPath;}
        else if (root.elem == key) {
            found = true;
            path += root.elem;}
        return path;}
 } 
  