import java.util.HashMap;

public class MaxRangeEqualNumbers {

    public static void main(String[] args){

        int arr[] = new int[]{1,0,0,1,0,1,1};
        System.out.println(equalnumbers(arr));
    }

    static int equalnumbers(int arr[]){

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0 , ans=0;
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==0){
                sum = sum + (-1);
            }
            else{
                sum = sum + 1;
            }

            if(map.containsKey(sum)){
                int index = i - map.get(sum);
                if(index > ans){
                    ans = index;
                }
            }
            else{
                map.put(sum,i);
            }
        }
        return ans;
    }
    
}
