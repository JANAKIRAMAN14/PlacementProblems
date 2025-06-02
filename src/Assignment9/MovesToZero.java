package Assignment9;
import java.util.*;
public class MovesToZero {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 4};
      int res[] =  movesTozero(arr);
      for(int i : res){
          System.out.print(" "+i);
      }
    }
    static int[] movesTozero(int [] arr){
        int [] res = new int [arr.length];
        int start = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                res[start] = arr[i];
                start++;
            }
        }
        return res;
    }
}
