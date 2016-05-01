public class Solution {
    /**
     * @param n a positive integer
     * @return an integer
     */
    public static int numSquares(int n) {
        // Write your code here
        if(n<=0)
            return 0;
        int [] arr = new int[n+1];
        for(int i=1; Math.pow(i,2)<=n; i++){
            arr[(int)Math.pow(i,2)] = 1;
        }

        for(int j=1; j<=n; j++){
            System.out.println((j-1)+":"+arr[j-1]);
            if(arr[j]==1)
                continue;
            int min = Integer.MAX_VALUE;
            for(int k=1; Math.pow(k,2)<=j; k++){
                int tmp = arr[k]+arr[j-k];
                if(tmp<min)
                    min = tmp;
            }
            arr[j] = min;
        }
        return arr[n];
    }

    public int numSquares(int n) {
        // Write your code here
        if(n<=0)
            return 0;
        int []arr = new int[n+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
        for(int i=1; i*i<=n; i++){
            arr[i*i] = 1;
        }
        for(int j=1; j<=n; j++){
            for(int k=1; a+k*k<=n; k++){
                arr[a+k*k] = min(arr[a]+1,arr[a+k*k]);
            }
        }
        return arr[n];
    }

    private int min(int num1,int num2){
        return num1>num2?num2:num1;
    }

    public static void main(String[]args){
        System.out.println(numSquares(12));
    }
}