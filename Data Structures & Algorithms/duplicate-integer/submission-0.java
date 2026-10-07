class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> tmp = new HashSet<>();
        for(int num:nums){
           
           if(tmp.contains(num)){
            return true;
           }
           tmp.add(num);
        }
        return false;
    }
}