/* Program to print divisors of given number */
// input number = 36
// output numbers =  1 2 3 4 6 9 12 18 36
class DivisionNumbers{
    public static void main(String [] args){
        int n = 36;
        System.out.println("Factors of "+n+" are: ");

        // Loop runs from 1 to 36
        for(int i=1; i<=n; ++i){

        // If i is divisible by 1 then i is the factor of provided number 36
        if ( n % i==0 ){

            System.out.println(i + " ");
        }

        }

    }
}