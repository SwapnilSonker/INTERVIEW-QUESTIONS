public class RotatedArray {

    public static void main(String[] args){
        int a[] = new int[]{20,30,40,50,60,5,10};
        System.out.println(rotated_array(a, 5));
    }
    static int rotated_array(int a[] , int key){
        int low = 0;
        int high = a.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(a[mid] == key){
                return mid;
            }
            else if(a[low] < a[mid]){
                if(key >= a[low] && key < a[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(key > a[mid] && key <= a[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    
}
