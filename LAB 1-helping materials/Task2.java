//Task 02: Container with Most Water
import java.util.Arrays;
class Task2{
    public static int mostWater( Integer[] height ){
        int length = height.length;
        int startmaxh = 0;
        int startmaxhIdx = 0;
        int i = 0;
        while (i < length) {
            if (height[i] > startmaxh) {
                startmaxh = height[i];
                startmaxhIdx = i;}
            i++;}
        int endmaxh = 0;
        int max_area = 0; 
        for (int j = startmaxhIdx + 1; j < length; j++) {
            int h = Math.min(startmaxh, height[j]); 
            int area = h * (j - startmaxhIdx);
            if (area > max_area) {  
                max_area = area;
                endmaxh = height[j]; }}

        return max_area;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] heightay = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(heightay);
        System.out.println("\nExpected Output:");
        System.out.print("49");
 System.out.print("\nYour Output:\n");
        mostWater( heightay );

    }
}
