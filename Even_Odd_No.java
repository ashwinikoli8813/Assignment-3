
import java.util.Scanner;

class Even_Odd_No{

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("enter any number");
        int number = s1.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is Even:-"+number);
        }else{
            System.out.println("Number is Odd:-"+number);
        }
    }
}