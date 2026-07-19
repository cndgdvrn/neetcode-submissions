class Solution {
    public boolean isAnagram(String ilkString, String ikinciString) {
                //read -- dear / racecar -- carrace

        HashMap<String,Integer> ilk_map = new HashMap<>();

        char[] ilkStringCharArray = ilkString.toCharArray();
        for(int i=0; i<ilkStringCharArray.length;i++){
            if(ilk_map.containsKey(String.valueOf(ilkStringCharArray[i]))){
                Integer bulunan = ilk_map.get(String.valueOf(ilkStringCharArray[i])) + 1;
                ilk_map.put(String.valueOf(ilkStringCharArray[i]),bulunan);
            }else{
                ilk_map.put(String.valueOf(ilkStringCharArray[i]),1);
            }
        }
        HashMap<String,Integer> ikinci_map = new HashMap<>();
        char[] ikinciStringCharArray = ikinciString.toCharArray();
        for(int i=0; i<ikinciStringCharArray.length;i++){
            if(ikinci_map.containsKey(String.valueOf(ikinciStringCharArray[i]))){
                Integer bulunan = ikinci_map.get(String.valueOf(ikinciStringCharArray[i])) + 1;
                ikinci_map.put(String.valueOf(ikinciStringCharArray[i]), bulunan);
            }else{
                ikinci_map.put(String.valueOf(ikinciStringCharArray[i]),1);
            }
        }

        for(Map.Entry<String,Integer> entry : ilk_map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.print(key + " -> " + value );
            System.out.println();
        }
        System.out.println("-------------------------------------");
        for(Map.Entry<String,Integer> entry : ikinci_map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.print(key + " -> " + value );
            System.out.println();
        }


        return ilk_map.equals(ikinci_map);
    }
}
