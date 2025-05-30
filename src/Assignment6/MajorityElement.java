package Assignment6;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int n = 7;
        int [] arr = {3,3,4,2,3,3,3};
        System.out.println(majorityElement(n,arr));
    }
    static int majorityElement(int n , int []arr){
        int max = Integer.MIN_VALUE;
        int value = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(arr[i] , map.getOrDefault(arr[i],0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(max < entry.getValue()) {
                max = entry.getValue();
                value = entry.getKey();
            }
        }
        return value;
    }
}
