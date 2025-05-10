//Task 02: Decryption Process
class Task2{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){
        int [] sumColums=new int [matrix[0].length];
        Integer[] array = new Integer[matrix[0].length-1];
        for(int j=0;j<matrix[0].length;j++){
           for(int i=0;i<matrix.length;i++){
             sumColums[j]+=matrix[i][j];}}
        for(int k=0;k<sumColums.length-1;k++){
          array[k]=sumColums[k+1]-sumColums[k];}
        return array;}

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}