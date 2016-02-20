public class Solution {
    /*
     * param a: The first integer
     * param b: The second integer
     * return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
        do{
        	int c = (a&b)<<1;
        	a = a^b;
        	b = c;
        }while(b!=0);
       return a;
    }
}