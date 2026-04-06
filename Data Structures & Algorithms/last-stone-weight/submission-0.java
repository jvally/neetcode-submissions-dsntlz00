class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < stones.length; i++) {
            pq.offer(-stones[i]);
        }//puts all elems in heap(heap given is min heap)

        while(pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if(b > a) { //a is either bigger or equal to b
                pq.offer(a - b);
            }
        }

        pq.offer(0);
        return Math.abs(pq.peek()); 
    }

}
