package Assignment6;
import java.util.*;
public class MaximumSubarray {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int count = 0;
        System.out.println(maximumSubarray(arr));
    }
    static int maximumSubarray(int [] arr ){
       int maxsofar = arr[0];
       int currmax = arr[0];
       for(int i = 0 ; i < arr.length ; i++){
           currmax = Math.max(arr[i] , currmax + arr[i]);
           maxsofar = Math.max(currmax,maxsofar);
       }
       return maxsofar;
    }
}
