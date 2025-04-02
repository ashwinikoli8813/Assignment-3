public class ReverseNumber {
public static void main(String[] args) 
{ 
	int num = 1234; int reversed = 0;

	while (num != 0)
	{
        	int digit = num % 10; // Get last digit
        	reversed = reversed * 10 + digit; // Build reversed number
        	num /= 10; // Remove last digit
    	}
    
   	 System.out.println("Reversed number: " + reversed);
}

}