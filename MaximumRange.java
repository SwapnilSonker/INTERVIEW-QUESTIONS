import java.util.HashMap;

public class MaximumRange {

    public static void main(String[] args){

        int arr[] = new int[]{10,5,7,2,1,9};
        int key = 15;
        System.out.println(maximumNumber(arr, key));
    }

    static int maximumNumber(int arr[] , int key){

        HashMap<Integer , Integer> map = new HashMap<>();
        
        int sum = 0;
        int start = 0;
        int end = -1;
        int max = 0;
        int i;
        for(i =0;i<arr.length;i++){
            sum += arr[i];

        if(sum == key){
            start = 0;
            end = i;
            max= i+1;
        }
        if(!map.containsKey(sum)){

            //putting value in the map
            map.put(sum,i);
        }
        if(map.containsKey(sum-key)){
            start = map.get(sum-key) + 1;
            end = i;
            int index = i - map.get(sum-key);

            if(index>max){
                max = index;
            }
        }

    }
    return max;
}
}
