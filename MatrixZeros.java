class MatrixZeros{
    public static void main(String[] args){

        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setzeroes(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
}
    static void setzeroes(int[][] matrix){
        int call = 1;
        int rows = matrix.length;
        int col = matrix[0].length;

        //checking if the matrix[0][0] -> first element of first coloumn in any of the row is zero or not.
        for(int i = 0; i< rows ; i++){
            if(matrix[i][0] == 0) call = 0;
            //now using loop for coloumn to traverse nad make 
            //the arbitrary arrays to zero 
            for(int j =0; j< col ;j++)
                if(matrix[i][j] == 0)
                matrix[i][0] = matrix[0][j] = 0;
        }

        /*now traversing from back to not affect array elements be affected */
        for(int i = rows-1 ;i>=0;i--){
            for(int j=col-1 ;j>= 1 ;j--){
                if(matrix[i][0]==0 || matrix[0][j]==0)
                matrix[i][j]=0;

            if(call == 0)matrix[i][0]=0;    
            }
        }
    }
}

/* Time complexity -> O(2*(n*m)) -> as we are traversing n array m times
Space complexity -> O(1) */