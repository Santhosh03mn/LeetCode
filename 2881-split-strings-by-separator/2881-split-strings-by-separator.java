class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String>list=new ArrayList<>();
        for(String num : words){
            String[]ans=num.split("["+separator+"]");
            for(String val : ans){
                if(val.length()>=1){
                    list.add(val);
                }
            }
        }
        return list;
    }
}