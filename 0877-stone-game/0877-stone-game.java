class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int Asum=0;
        int Bsum=0;
        for(int i=0; i<n; i++){
            if(i%2==0) Asum+=piles[i];
            else Bsum+=piles[i];
        }
        if(Asum>Bsum) return true;
        Asum=0;
        Bsum=0;
        for(int i=0; i<n; i++){
            if(i%2!=0) Asum+=piles[i];
            else Bsum+=piles[i];
        }
        if(Asum>Bsum) return true;
        return false;
    }
}