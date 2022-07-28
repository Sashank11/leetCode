package BinarySearch;

public class KoKoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i = 0; i < piles.length; i++){
            if(piles[i] > max){
                max = Math.max(max, piles[i]);
            }
            
        // int[] arr = new int[max.length-1];
        // for(int i = 1; i<max.length; i++){
        //     arr[i-1] = i;
        }
        
        int l = 1;
        int r = max;
        int mid =(l+r)/2;
        while(l < r){
            mid = (l + r)/2;
            // System.out.println(mid);
            int sum = 0;
            for (int pile : piles) {
                sum += Math.ceil((double) pile / mid);
            }

                // System.out.println(sum);
            if(sum > h){
                l = mid + 1;
                
            }
            else if(sum <= h){
                r = mid;
                
            }   
            }
            return r;
    }
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
}
