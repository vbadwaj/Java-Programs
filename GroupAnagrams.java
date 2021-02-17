class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList();
        HashMap<String, List> hm=new HashMap<String, List>();
        for(String sol: strs){
            char[] ch=sol.toCharArray();
            Arrays.sort(ch);
            String key=String.valueOf(ch);
            if(!hm.containsKey(key)) hm.put(key,new ArrayList());
            hm.get(key).add(sol);
        }
       return new ArrayList(hm.values()); 
    }
}
