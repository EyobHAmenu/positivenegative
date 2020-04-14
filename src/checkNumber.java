import java.util.Scanner;
public class checkNumber {
    public static void main(String[] args)
    {
    /*
    Test Data
    Enter a number: 35
    35 is positive.
    */
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Test Data.");
        System.out.print("Enter a number please");
        num = scan.nextInt();
        if (num >= 0){
            System.out.println(num + " is positive");
        } else {
            System.out.println(num + " is negative");
        }
    }

}
