class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[]result = new int[temperatures.length];
        //sliding window approach
        for(int l = 0;l < temperatures.length;l++){
            for(int r = l + 1;r < temperatures.length;r++){
                if(temperatures[r] > temperatures[l]){
                    result[l] = r - l;
                    break;
                } else{
                    result[l] = 0;
                }
            }
        }
        return result;

    }
}
