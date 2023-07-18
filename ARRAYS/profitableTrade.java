// package Arrays;
public class profitableTrade {
    public static int stock(int arr[]) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        for (int i = 0; i < arr.length; i++) {
            if(buy>arr[i]){
                buy = arr[i];
            }else{
                sell = Math.max(sell, arr[i]-buy);
            }
        }
        return sell;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(stock(arr));
    }
}
