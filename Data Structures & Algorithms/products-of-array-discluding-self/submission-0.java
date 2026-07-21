class Solution {
    public int[] productExceptSelf(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            int res = 1;
            for (int j=0; j < nums.length ; j++){
                if(j == i){
                    continue;
                }
                res = res * nums[j];
            }
        list.add(res);
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

}  
