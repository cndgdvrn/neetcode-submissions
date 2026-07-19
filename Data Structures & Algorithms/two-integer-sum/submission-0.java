class Solution {
    public int[] twoSum(int[] nums, int target) {
                int[] sonuc = new int[2];
        boolean isOk=false;
        for (int i = 0; i < nums.length; i++) {
            int geciciDeger = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (geciciDeger + nums[j] == target) {
                    sonuc[0] = i;
                    sonuc[1] = j;
                    isOk=true;
                    System.out.println("ic for breaklendi");
                    break;
                }
            }
            System.out.println("dis for breaklendi");
            if(isOk) break;
        }
        return sonuc;
    }
}
