package Assignment13;

public class StockSpan2 {
    public static void main(String[] args) {
        int [] arr = {100,80,60,70,60,75,85};
        int res[] = stopSpanStock(arr);
        for(int i : res){
            System.out.print(" "+i);
        }
    }
    static int[] stopSpanStock(int [] arr){
        int [] res = new int[arr.length];
        int n = arr.length - 1 ;
        res[0] = 1;
        for(int i = n  ; i > 0 ; i--){
            for(int j = i - 1 ; j >= 0 ; j--){
                if(arr[i] < arr[j]){
                    res[i] = i - j;
                    break;
                }
            }
        }
        return res;
    }
}
