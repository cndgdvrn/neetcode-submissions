class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> distinctSet = new HashSet<>();
        for (int num : nums) {
            distinctSet.add(num);
        }
        // true == duplicate VAR --------- false == duplicate YOK
        return !(distinctSet.size() == nums.length);
    }
}