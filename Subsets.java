class Solution {
    public void helper(int[] nums, int index, List<Integer>list1, List<List<Integer>>ans){
        
        ans.add(new ArrayList<>(list1));

        //exploring the elements 
        for(int i=index; i<nums.length; i++){
            list1.add(nums[i]);
        helper(nums, i+1, list1, ans);
        
        //backtracking 
        list1.remove(list1.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}
