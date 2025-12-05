class Solution {
    private void func(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> ans){
        //base condition
        if (target==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if (index==candidates.length || target<0){
            return;
        }
        //logic
        //pick the element at the given index
        current.add(candidates[index]);

        //stay at the same position
        func(index, candidates, target - candidates[index], current, ans);

        //backtracking
        current.remove(current.size()-1);

        //dont pick any data, move to the next index
        func(index+1, candidates, target, current, ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        func(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
}
