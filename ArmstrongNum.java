import java.util.Scanner;

public class ArmstrongNum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int original = num, sum = 0, digits = 0;
        int temp = num;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (original == sum)
        {
            System.out.println(original + " is an Armstrong number.");
        } else

        {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
