class Solution {
    public List<String> stringMatching(String[] words) {
     Set<String> resultSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
        
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(currentWord)) {
                    resultSet.add(currentWord);
                    break;
                }
            }
        }
        
        return new ArrayList<>(resultSet);
    }   
}