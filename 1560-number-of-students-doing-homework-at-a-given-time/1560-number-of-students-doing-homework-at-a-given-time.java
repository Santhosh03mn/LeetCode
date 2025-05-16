class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        int startTimeSize = startTime.length;
        for (int i = 0; i < startTimeSize; i++)
            if (startTime[i] <= queryTime && endTime[i] >= queryTime)
                count++;
        return count;
    }
}