import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class MinimumPages {
    public static void main(String[] args){
        int arr[] = new int[]{10,20,30,40};
        System.out.println(Pages(arr,2));
    }
    static int Pages(int arr[],int key){
/*The above function in used to find the minimum no. of pages required to be read by each student.
There are some cases need to be understood before implementing solution.
1.During selction of a number form the array we cannot skip a element or we cannot divide a element into halves
2.selction is done like , if student1 is reading a[1] then student2 will read all the remaining ones,and if 
reading a[1],a[2] then student2 will read all the remaining elements. */

        int sum = 0; //variable to store the sum of array
        for(int i =0 ; i< arr.length ; i++)
                sum += arr[i];

        int res = 0;//to store the result (which will display)
        int min = 0;//starting of the array
        int max = (int)sum; //maximum element of the array.
        while(min <= max){ //checking starting point is less than end.
            int mid = min + (max - min)/2; //finding middle index & element.
            if(isvalid(arr,key,mid)){ //considering the isValid function.
                res = mid;//storing the mid value , if condition is true.
                max = mid - 1;//reducing the max to mid - 1 i.e moving left to the array.
            }
            else{
                min = mid + 1;//moving right to the array by shifting starting point to mid + 1.
            }
        }
        return res;//this will return the answer.
    }
    static boolean isvalid(int arr[] , int key , int res){

        /*we have taken this function boolean beacuse we have to return true/false ias thr output.
        this will check that if the books are being didtriubuted to the given no. of students or the 
        no. is increased.
        
        if increased then return false else true
        
        the array will check after adding every element that if the sum is > result or not , if greater 
        then increment the student and change res value to current sum , else add one more element to sum.*/
        int student = 1 ;
        int sum = 0;
        for(int i = 0 ; i< arr.length;i++){

            if(sum + arr[i] > res){
                student++;//increments the student
                res = arr[i];//updates the res value
            }
            else{
                sum += arr[i];//increment the res value
            }
        }
        return student<=key; //returns true/false
}

}
/*Time Complexity(Optimised solution) -> O(logn * n) -> above solution
Time complexity(Brute Force) -> O(2^n)  */
