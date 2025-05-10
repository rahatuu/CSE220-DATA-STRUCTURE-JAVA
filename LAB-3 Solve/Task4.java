// Task 04: Matrix Compression
class Task4{

    //Complete this method so that it gives the Expected Output
    public static Integer[][] compressMatrix( Integer[][] matrix ){
        Integer[][] new2Darray= new Integer[matrix.length/2][matrix[0].length/2];
        for(int i=0;i<matrix.length/2;i++){
         for(int j=0;j<matrix[0].length/2;j++){
           int row= i*2;
           int col= j*2;
           new2Darray[i][j]=matrix[row][col]+matrix[row+1][col]+matrix[row][col+1]+matrix[row+1][col+1];}}
        return new2Darray;}
    

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}