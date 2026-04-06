class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = piles[0];
        for(int num: piles){
            r = Math.max(r, num);
        }
        int res = r;//max of piles to be considered smallest
        while(l <= r){
            int mid = (l + r)/2;//mid is the eating spee
            long time = 0;
            for(int p: piles){
                time += Math.ceil((double) p / mid);
            }
            if(time <= h){
                res = mid;
                r = mid - 1;
            } else{
                l = mid + 1;
            }
        }
        return res;

    }
}
