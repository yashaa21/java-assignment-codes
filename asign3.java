import java.util.Scanner;

public class asign3 {
    public static void main(String[] args) {
        System.out.println("Enter two Integers");
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long product = 1;

        for (long i = a; i < b; i++) {
            product = product * i;
        }
        System.out.print("The product is" + product);
        long x = product;

        do {
            long sum = 0;
            while (x != 0) {
                long rem = x % 10;
                sum = sum + rem;
                x = x / 10;
            }
            if (sum < 10) {
                System.out.print("\n The sum is " + sum);
                break;
            } else
                x = sum;

        } while (x > 10);

    }
}