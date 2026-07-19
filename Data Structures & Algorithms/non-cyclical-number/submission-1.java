class Solution {
    

    public boolean isHappy(int n) {
        HashSet<Integer> prevNums = new HashSet<>();
        while (true){
            List<Integer> digits = findDigits(n);
            Integer sum = findSum(digits);
            if(sum == 1){
                System.out.println("buldu");
                return true;
            }
            if (prevNums.contains(sum)) {
                return false;
            } else {
                prevNums.add(sum);
                n= sum;
            }
        }
    }

    public static List<Integer> findDigits(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        while (number > 0) {
            int digit = number % 10;
            list.add(digit);
            number = number / 10;
        }
        return list;
    }

    public Integer findSum(List<Integer> list) {
        int sum = 0;
        for (Integer digit : list) {
            sum = sum + digit * digit;
        }
        return sum;
    }


}

