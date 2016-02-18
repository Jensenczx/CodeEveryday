public class Interval {
      int start, end;
      Interval(int start, int end) {
          this.start = start;
          this.end = end;
      }


class Solution {
    /**
     * @param intervals: An interval array
     * @return: Count of airplanes are in the sky.
     */
    public int countOfAirplanes(List<Interval> airplanes) { 
        // write your code here
        if(airplanes==null)
        	return 0;
        if(airplanes.size()==0)
        	return 0;
        int maxTime = getTheMaxEndTime(airplanes);
        int[] airTimeArray = new int[maxTime];
        for(int i=0; i<airplanes.size(); i++){
        	Interval tmp = airplanes.get(i);
        	airTimeArray[tmp.start-1]++;
        	airTimeArray[tmp.end-1]--;
        }
        return maxSumOfSubArray(airTimeArray);
    }

    public int maxSumOfSubArray(int[] array){
    	int curSum=array[0];
    	int maxSum=array[0];
    	for(int i=1; i<array.length; i++){
    		if(curSum<0)
    			curSum = array[i];
    		else curSum += array[i];
    		if(curSum>maxSum)
    			maxSum = curSum;
    	}
    	return maxSum;
    }

    public int getTheMinStartTime(List<Interval> airplanes){
    	int min=list.get(0).start;
    	for(int i=1; i<airplanes.size(); i++){
    		if(airplanes.get(i).start<min)
    			min = airplanes.get(i).start;
    	}
    	return min;
    }

    public int getTheMaxEndTime(List<Interval> airplanes){
    	int max = list.get(0).end;
    	for(int i=1; i<airplanes.size(); i++){
    		if(airplanes.get(i).end>max)
    			max = airplanes.get(i).end;
    	}
    	return max;
    }


}