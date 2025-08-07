class Solution {
    public boolean isPathCrossing(String path) {
        int x=0,y=0;
        Set<String>set=new HashSet<>();
        set.add("0,0");
        for(char ch : path.toCharArray()){
            if(ch=='E'){
                x++;
            }
            else if(ch=='W'){
                x--;
            }
            else if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
            String s=x+","+y;
            if(set.contains(s)){
                return true;
            }
            set.add(s);
        }
        return false;
    }
}