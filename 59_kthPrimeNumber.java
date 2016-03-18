class Solution {
    /**
     * @param k: The number k.
     * @return: The kth prime number as description.
     */
    //第一种实现方式，会发生越界问题
    public long kthPrimeNumber(int k) {
        // write your code here
        if(k<=0)
        	return 0;
        long i=3;
        int num=0;
       while(true){
       	long tmp = i;
       	while(i%3==0) i=i/3;
       	while(i%5==0) i=i/5;
       	while(i%7==0) i=i/7;
       	if(i==1)
       		num++;
       	if(num==k)
       		return tmp;
       	i = tmp++;
       }
    }

/*第二种实现方式，通过空间换时间，也是在计算一些数字通
过因数组成的问题时常用的一种方式。*/
    public long kthPrimeNumber(int k){
    	if(k<=0)
    		return 0;
    	int firstIndex = 0;
    	int secondIndex = 0;
    	int thirdIndex = 0;
    	long []array = new long[k];
    	array[0] = 1;
    	for(int i=1; i<k; i++){
    		array[i] = min(3*array[firstIndex],5*array[secondIndex],7*array[thirdIndex]);
    		if(array[i]==3*array[firstIndex])
    			firstIndex++;
    		if(array[i]==5*array[secondIndex])
    			secondIndex++;
    		if(array[i]==7*array[thirdIndex])
    			thirdIndex++;
    	}
    	return array[k-1];
    }

    public long min(long num1,long num2,long num3){
    	long min = num1<num2?num1:num2;
    	return min<num3?min:num3;
    }
};