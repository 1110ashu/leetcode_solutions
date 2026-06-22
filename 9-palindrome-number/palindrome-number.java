class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n = x;
        int revNum = 0;
        while(x>0){
            int d = x % 10;
            revNum = revNum*10 + d;
            x = x/10;
        }
        if( revNum == n ){
            return true;
        }else{
            return false;
        }
    
    }
}