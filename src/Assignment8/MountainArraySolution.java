package Assignment8;
import java.util.*;

interface MountainArray {
    public int get(int index);
    public int length();
}

// Mock implementation of MountainArray
class MockMountainArray implements MountainArray {
    private int[] arr;

    public MockMountainArray(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }
}

public class MountainArraySolution {
    public static void main(String[] args) {
        int[] mountain = {1, 3, 5, 7, 6, 4, 2}; // Mountain-shaped array
        int target = 6;

        MountainArray arr = new MockMountainArray(mountain);
        MountainArraySolution solution = new MountainArraySolution();
        int result = solution.findInMountainArray(target, arr);

        System.out.println("Target " + target + " found at index: " + result);
    }

    public int findInMountainArray(int target, MountainArray arr) {
        int n = arr.length();
        int start = 0 ;
        int end = n - 1 ;

        // Find peak
        while(start < end){
            int mid = (start + end) / 2;
            int mid_val = arr.get(mid);
            int next_mid = arr.get(mid + 1);
            if(mid_val < next_mid){
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        int peak = start;
        int res = binarySearch(arr, 0, peak, target, true);
        if(res != -1) return res;

        return binarySearch(arr, peak + 1, n - 1, target, false);
    }

    public static int binarySearch(MountainArray arr, int start, int end, int target, boolean asc) {
        while(start <= end){
            int mid = (start + end) / 2;
            int mid_val = arr.get(mid);

            if(mid_val == target) return mid;

            if(asc){
                if(mid_val < target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(mid_val > target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
