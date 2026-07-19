class Solution {
       public static int search(int[] nums, int target) {
        int baslangic = 0;
        int bitis = nums.length-1;

        while (baslangic <= bitis){
            int orta = (baslangic + bitis) / 2;

            if(target > nums[orta]){
                baslangic = orta +1;
            }else if(target < nums[orta]){
                bitis = orta -1;
            }

            if(target == nums[orta]){
                return orta;
            }
        }
        return -1;
    }
}
