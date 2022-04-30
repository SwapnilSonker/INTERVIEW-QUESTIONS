public class Kadane {

    public static void main(String[] args){

        int a[] = {-2 , -3 , -4 , 6, 4 , 7,  9 ,-10};
        System.out.println(MaxSumOfArray(a));

    }
    static int MaxSumOfArray(int a[]){
        int maxsum = 0;
        int cursum = 0;
        for(int i=0; i<=a.length-1 ;i++){
            cursum += a[i];
            if(cursum > maxsum){
                maxsum = cursum;
            } 
            if( cursum < 0){
                cursum = 0;
            }
        }
        return maxsum;
    }
    
}
