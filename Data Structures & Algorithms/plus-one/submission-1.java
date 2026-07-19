class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        
        java.math.BigInteger i = new java.math.BigInteger(sb.toString());
        i = i.add(java.math.BigInteger.ONE);

        java.util.ArrayList<Integer> ints = new java.util.ArrayList<>();
        
        while (i.compareTo(java.math.BigInteger.ZERO) > 0) {
            int digit = i.mod(java.math.BigInteger.valueOf(10)).intValue();
            ints.add(digit);
            i = i.divide(java.math.BigInteger.valueOf(10));
        }

        java.util.ArrayList<Integer> reversedInts = new java.util.ArrayList<>();
        for (int i2 = ints.size() - 1; i2 >= 0; i2--) {
            reversedInts.add(ints.get(i2));
        }

        return reversedInts.stream().mapToInt(value -> (int)value).toArray();    
    }
}