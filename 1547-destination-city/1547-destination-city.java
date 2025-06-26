class Solution {
    public String destCity(List<List<String>> paths) {
        List<String>ans=new ArrayList<>();
        for(int i=0;i<paths.size();i++){
            ans.add(paths.get(i).get(0));
        }
        for(int i=0;i<paths.size();i++){
            if(!ans.contains(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
        }
        return null;
    }
}