import java.util.Scanner;

public class GivenNumis_Armstrong{ 
public static void main(String[] args)
{ 
	Scanner scanner = new Scanner(System.in); 
	System.out.print("Enter a number: "); 
	int number = scanner.nextInt(); scanner.close();

	if (isArmstrong(number)) 
	{
        	System.out.println(number + " is an Armstrong number.");
    	} else
    	{
        	System.out.println(number + " is not an Armstrong number.");
    	}
}

public static boolean isArmstrong(int num)
{
    int originalNum = num, remainder, result = 0;
    int n = String.valueOf(num).length();

    while (num != 0) 
    {
        remainder = num % 10;
        result += Math.pow(remainder, n);
        num /= 10;
    }

    return result == originalNum;
}

}