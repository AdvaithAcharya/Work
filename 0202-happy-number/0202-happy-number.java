class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=nextSum(n);
        while(fast!=1 && slow!=fast){
            slow=nextSum(slow);
            fast=nextSum(nextSum(fast));
        }
        return fast==1;
    }
    private int nextSum(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit*digit;
            num/=10;
        }
        return sum;
    }
}