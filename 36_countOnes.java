public class Solution {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
        // write your code here
        int count=0;
        while(num!=0){
            count++;
            num=num&(num-1);
        }
        return count;
    }
};