class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     
     HashMap<Integer, Integer> hm = new HashMap<>();

     for(int num: nums){
        if(hm.containsKey(num)){
            hm.put(num, hm.get(num)+1);
        }
        else{
            hm.put(num, 1);
        }
     }

     int[] ans = new int[k];

     for(int i=0;i<k;i++){
        int maxFreq = 0;
        int maxNum = 0;

        for(Integer key: hm.keySet()){
            if(hm.get(key)> maxFreq){
                maxFreq = hm.get(key);
                maxNum = key;
            }
        }
            ans[i] = maxNum;

            hm.remove(maxNum);
     
     
     }

     return ans;
    }

}
