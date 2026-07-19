class Solution {
        public List<List<String>> groupAnagrams(String[] strings) {

        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String cs = new String(charArray);
            if (!map.containsKey(cs)){
                ArrayList<String> stringArrayList = new ArrayList<>();
                stringArrayList.add(s);
                map.put(cs, stringArrayList);
            }else{
                List<String> stringList = map.get(cs);
                stringList.add(s);
            }
        }

        ArrayList<List<String>> resultList = new ArrayList<>();
        for (Map.Entry<String,List<String>> entry: map.entrySet()){
            ArrayList<String> list = new ArrayList<>();
            list.addAll(entry.getValue());
            resultList.add(list);
        }
        
        return resultList;
    }
}
