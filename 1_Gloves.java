import java.util.*;

public class Gloves {
   
     public static int findMinimum(int n, int[] left, int[] right) {
        // write code here
        int selectNum = 0;
        if(n==0||left==null||right==null||left.length==0||right.length==0)
            return selectNum;
        int tmpSelectNum = 0;
        tmpSelectNum = findOneColorCost(left,right)+getAllColorCost(left,right);
        selectNum = findOneColorCost(right,left)+getAllColorCost(right,left);
        if(tmpSelectNum<selectNum)
            return tmpSelectNum;
        return selectNum;     
    }

    public static int findOneColorCost(int[] array1,int[] array2){
        int cost = 0;
        for(int i=0; i<array1.length; i++)
            if(array2[i]==0)
                cost += array1[i];
        cost++;
        return cost;
    }


    public static int getAllColorCost(int[] array1,int[] array2){
    	int min = -1;
    	int cost = 0;
        for(int j=0; j<array1.length; j++){
        	if(min==-1&&array2[j]!=0)
        		min = array2[j];
        	else if(min!=-1&&array2[j]<min&&array2[j]!=0)
        		min = array2[j];
        	cost += array2[j];
        }
        if(min>1)
       	  cost = cost - min + 1;
        return cost;
    }

    public static void main(String[] args){
    	int [] left = {1,2,0,1,3,1};
    	int [] right= {0,0,0,2,0,1};
    	System.out.println(findMinimum(6,left,right));
    }
}