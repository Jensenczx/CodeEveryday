class Solution {
    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        List<String> list = new ArrayList<String>();
        if(dictionary==null||dictionary.length==0)
        	return list;
        int lenFlag = 0;
        for(String str:dictionary){
        	if(str!=null){
        		if(str.length()==lenFlag)
        			list.add(str);
        		else if(str.length()>lenFlag){
        			list.removeAll(list);
        			list.add(str);
        			lenFlag = str.length();
        		}
        	}
        }
        return list;
    }
};
