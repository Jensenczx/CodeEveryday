class Solution {
    /**
     * @return: The same instance of this class every time
     */
     private static Solution instance=null;
     
    private Solution(){
        
    }
    public static Solution getInstance() {
        // write your code here
        if(instance==null){
            synchronized (Solution.class){
                if(instance==null)
                    instance = new Solution();
            }
        }
        return instance;
    }
};