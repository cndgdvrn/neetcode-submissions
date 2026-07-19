class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if(!map.containsKey(num)){
                map.put(num,1);
            }else {
                Integer value = map.get(num);
                map.put(num,value+1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            priorityQueue.add(entry);
        }

        int [] result = new int[k];
        for (int i = 0; i<k ; i++) {
            Map.Entry<Integer, Integer> polled = priorityQueue.poll();
            result[i] = polled.getKey();
        }
        return result;
    }
}
