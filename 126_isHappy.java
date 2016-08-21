public class Solution {
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    
    public boolean isHappy(int n) {
        int[] array = new int[811];
        while(getTheSum(n) != 1){
            n = getTheSum(n);
            if(array[n] == 1)
                return false;
            array[n] = 1;
        }
        return true;
    }

    public int getTheSum(int n) {
        int sum = 0;
        while(n != 0) {
            int tmp = n % 10;
            sum += tmp * tmp;
            n = n / 10;
        }
        return sum;
    }

}