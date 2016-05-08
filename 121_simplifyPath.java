public class Solution {
    /**
     * @param path the original path
     * @return the simplified path
     */
    public String simplifyPath(String path) {
        // Write your code here
       if(path==null||path.length()==0)
        	return "";
        StringBuilder result = new StringBuilder();
        String[] paths = path.split("/");
        LinkedList<String> stack = new LinkedList<String>();
        for(int i=0; i<paths.length; i++){
        	String tmp = paths[i];
        	if(tmp.equals(""))
        		continue;
        	if(tmp.equals("."))
        		continue;
        	if(tmp.equals("..")){
        		if(i>=2){
        			stack.remove(stack.get(stack.size()-1));
        		}
        		continue;
        	}
        	stack.add(tmp);
        }
        int size = stack.size();
        result.append("/");
        for(int j=0; j<size; j++){
        	result.append(stack.get(j));
        	if(j!=size-1)
        	result.append("/");
        }
        return result.toString();
    }
}