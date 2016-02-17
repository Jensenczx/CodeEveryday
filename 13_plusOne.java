 public class Solution {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public static int[] plusOne(int[] digits) {
        // Write your code here
        if(digits==null||digits.length==0)
        	return new int[0];
        boolean isCarry = false;
        boolean isFirst = true;
        for(int i=digits.length-1; i>=0; i--){
        	if(isFirst){
        		digits[i]++;
        		isFirst = false;
        		if(digits[i]>9){
        			digits[i] = digits[i]%10;
        			isCarry = true;
        		}
        		else return digits;
        	}else if(isCarry){
        		digits[i]++;
        		if(digits[i]>9){
        			digits[i] = digits[i]%10;
        			isCarry = true;
        		}else return digits;
        	}else if(!isCarry)
        		return digits;
        }
        int []result = new int[digits.length+1];
        result[0]=1;
        for(int i=1; i<digits.length+1; i++){
        	result[i] = digits[i-1];
        }
        return result;
    }


    public static int getTheRealNumByArray(int[] array){
    	int num =0; 
    	for(int i=array.length-1; i>=0; i--){
    		num = num*10+array[i];
    	}
    	return num;
    }

    public static int[] getTheArrayByNum(int num){
    	int length=0;
    	int tmp = num;
    	while(tmp!=0){
    		tmp = tmp/10;
    		length++;
    	}
    	int []result = new int [length];
    	for(int i=0; i<length; i++){
    		result[i] = num%10;
    		num = num/10;
    	}
    	return result;
    }

    public static void main(String[]args){
    	System.out.println(plusOne(null));
    }

}