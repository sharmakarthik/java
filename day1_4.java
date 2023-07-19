// java program to find the sum of the digits

class day1_4{

    static int getSum(int n){
        int sum = 0;          // local variable : variable declared inside the class 
        while(n!=0){
            sum = sum + n%10; //sum = 0 + 687 % 10 = 0 + 7 i.e sum = 7
            n = n/10;
        }
    return sum;
    }

    public static void main(String args[]){
       int n = 99999;                             
       
       System.out.println(getSum(n));
}
}                                                 