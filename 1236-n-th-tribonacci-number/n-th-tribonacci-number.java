class Solution {
    public int tribonacci(int n) {
        if (n==0){
            return 0;
        }
        else if (n==1 || n==2){
            return 1;
        }
        else{
            int firstNum=0;
            int secondNum=1;
            int thirdNum=1;
            for(int i=1;i<=n;i++){
                int fourthNum=firstNum + secondNum + thirdNum;

                firstNum = secondNum;
                secondNum = thirdNum;
                thirdNum = fourthNum;
                 
            }
            return firstNum;
        
        }

        
    }
}