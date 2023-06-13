class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(hmap.containsKey(diff)){
                arr[0]=i;
                arr[1]=hmap.get(diff);
                return arr;
            }
            hmap.put(nums[i],i);
        }
        return arr;
    }
}
