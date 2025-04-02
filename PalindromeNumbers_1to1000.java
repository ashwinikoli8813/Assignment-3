public class PalindromeNumbers_1to1000{ 
public static void main(String[] args)
{ 
	System.out.println("Palindrome numbers from 1 to 100:");

	for (int num = 1; num <= 100; num++)
	{
        	if (isPalindrome(num))
        	{
            	System.out.println(num);
        	}
    	}
}

public static boolean isPalindrome(int num) 
{
    int originalNum = num;
    int reversed = 0;
    int temp = num;
    
    while (temp != 0)
    {
        int digit = temp % 10;
        reversed = reversed * 10 + digit;
        temp /= 10;
    }
    
    return originalNum == reversed;
}

}