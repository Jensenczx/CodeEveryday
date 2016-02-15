class Solution {
    /**
     *@param a, b: Two integer
     *return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        // write your code here
        int tmp = a^b;
        int num =0;
        while(tmp!=0){
        	num++;
        	tmp = tmp&(tmp-1);
        }
        return num;
    }

    public static void main(String[]args){
    	System.out.println(bitSwapRequired(14,31));
    }
}
