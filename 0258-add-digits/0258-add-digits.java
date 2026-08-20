class Solution {
    public int addDigits(int num) {
        while(num/10!=0){
        int dig=num;
        
        int sum=0;
            while(dig*10!=0){
            int lastDig=dig%10;
            sum+=lastDig;
            dig/=10;
            }
            num=sum;
        }
        return num;
    }
}