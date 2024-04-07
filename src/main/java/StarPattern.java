//Program to print star pattern triangle//
class StarPattern {
    public static void main(String[] args) {
        int height = 5; // You can adjust the height as needed

        // Loop to increment each row until height = 5
        for (int row = 1; row <= height; row++) {
            // Print spaces before the asterisks
            for (int space = 1; space <= height - row; space++) {
                System.out.print(" ");
            }

            // Print the asterisks
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line
        }
    }
}









