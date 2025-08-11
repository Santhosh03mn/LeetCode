class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String arr[] = text.split(" ");
        List<String> result = new ArrayList<>();
        for(int i = 0; i < arr.length - 2; i++){
            if(arr[i].equals(first) && arr[i+1].equals(second)){
                result.add(arr[i+2]);
            }
        }
        return result.toArray(new String[0]);
    }
}