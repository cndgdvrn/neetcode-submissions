class Solution {
    public int climbStairs(int n) {
        if (n == 1 || n==2){
            return n;
        }

        int i1= 1;
        int i2= 2;
        for (int i=2; i<n; i++){
            int tempi1=i1;
            i1=i2;
            i2=i2+tempi1;
        }
        return i2;
    }
}
