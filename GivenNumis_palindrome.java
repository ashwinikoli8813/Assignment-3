import java.util.Scanner;

public class GivenNumis_palindrome
{
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();
	scanner.close();

	if (isPalindrome(number))
	{
        	System.out.println(number + " is a palindrome number.");
    	} else
    	{
        	System.out.println(number + " is not a palindrome number.");
    	}
}

public static boolean isPalindrome(int num)
{
    int originalNum = num, reversedNum = 0, remainder;

    while (num != 0)
    {
        remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
        num /= 10;
    }

    return originalNum == reversedNum;
}

}