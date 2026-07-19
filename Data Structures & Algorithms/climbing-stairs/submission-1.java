class Solution {
    public int climbStairs(int n) {

        if (n == 1 || n==2){
            return n;
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (int i=2; i<n; i++){
            Integer n1 = list.get(i - 1);
            Integer n2 = list.get(i - 2);
            list.add(n1 + n2);
        }

        return list.getLast();
    }
}
