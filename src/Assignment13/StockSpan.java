package Assignment13;

public class StockSpan {
    public static void main(String[] args) {
        int [] arr = {100,80,60,70,60,75,85};
       int res[] = stopSpanStock(arr);
       for(int i : res){
           System.out.print(" "+i);
       }
    }
    static int[] stopSpanStock(int [] arr){
        int [] res = new int[arr.length];
        res[0] = 1;
        int l = 1;
        int r = arr.length;
        while(l < r){
            int count = 0;
            int cur = arr[l];
            for(int i = l-1 ; i >= 0 ; i--){
                count++;
                if(arr[l] < arr[i]){
                    break;
                }

            }
            res[l] = count;
            l++;
        }
        return res;
    }
}
