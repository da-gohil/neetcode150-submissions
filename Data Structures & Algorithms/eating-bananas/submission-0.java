class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        // guard
        if(piles == null || piles.length == 0) return 0;

        //getting the maxPile
        int maxPile =0;
        for(int pile : piles){
            maxPile = Math.max(maxPile, pile);
        }

        int left = 1;
        int right = maxPile;

        while(left < right){
            
            int mid = left + (right - left) / 2;

            int hours = 0;
            for(int pile : piles){
                hours = hours + (int) Math.ceil((double) pile / mid);
            }

            if(hours <= h){
                right = mid;
            }else{
                left = mid + 1;
            }

        }
        return left;
    }
}
