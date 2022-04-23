public class InfiniteBinarySearch {

    public static void main(String[] args){

        int a[] = new int[]{1,30,77,56,34,87};
        int key = 89;
        int ans = infiniteSearch(a, key);
        System.out.println(ans);   
    }
    static int infiniteSearch(int a[] , int key){
        int low = 0;
        int high = 1;
        int val = a[0]; //extra variable is taken.

        /* as soon as the key lies between low and high i.e key becomes less then low and high
        binarySearch function is executed. */
        while(key > val){
            low = high;

            if(2*high < a.length-1)
            {
                high = 2*high;
            }
            else{
                high = a.length-1;
            }
            val = a[high];
        }
        return binarySearch(a, key ,low ,high);
    }

    static int binarySearch(int a[] , int key , int low , int high){
        while(low <= high){
            int mid = (low + high)/2;
            if(a[mid] == key){
                return mid;
            }
            else if(key > a[mid])
            return binarySearch(a, key, mid+1, high);

            else
            return binarySearch(a, key, low, mid-1);
        }
        return -1;
    }
    
}
