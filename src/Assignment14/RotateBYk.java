package Assignment14;
import java.util.*;
public class RotateBYk {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int k = 2;
        System.out.println(firstRotate(arr, k));
    }
    static String firstRotate (int [] arr , int k){
        Deque<Integer> q1 = new ArrayDeque<>();
        Deque<Integer> q2 = new ArrayDeque<>();
        for(int i = 1 ; i <= arr.length ; i++){
            q1.offer(i);
        }
        while(k > 0){
            q2.offer(q1.poll());
            k--;
        }
        while(!q2.isEmpty()) {
            q1.addFirst(q2.poll());
        }
        return q1.toString();
    }
}
