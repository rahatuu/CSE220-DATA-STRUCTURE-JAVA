// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){    
          return sumTreeHelper(root, 0);}
         private static Integer sumTreeHelper(BTNode ro,int lvl){
          if(ro==null){return 0;} 
          int sum=0;
          if(lvl==0){ 
           sum +=(Integer)ro.elem;}
          else{
           sum +=(Integer)ro.elem%lvl;}
          sum+=sumTreeHelper(ro.left,lvl+1);
          sum+=sumTreeHelper(ro.right,lvl+1);                
          return sum;}
        //============================================================================

}
