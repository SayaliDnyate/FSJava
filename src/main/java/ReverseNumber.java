/* reverse number program */
// input number = 123
// output number = 321

class ReverseNumber {
    public static void main(String[] args)
    {
        int num = 123, reversed = 0;
        System.out.println("Original Number: "+num);

     //Run loop until num becomes 0
        while(num !=0) {

     // Get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

    // Remove the last digit from num
            num = num/10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}


//Example 2:
// input number = 234
// output number = 432
class ReverseNumbers {
    public static void main(String[] args)
    {
        int num = 234, reversed = 0;
        System.out.println("Original Number: "+num);

        //Run loop until num becomes 0
        while(num !=0) {

            // Get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // Remove the last digit from num
            num = num/10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}


