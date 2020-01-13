import java.util.Scanner;

public class NumRev {

    public static void main(String[] args) {

	    int rem = 0, reverseNum = 0, num = 0;


        System.out.println("Enter the value");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

	    while(num > 0) {
            rem = num % 10;
            reverseNum = (reverseNum* 10) + rem;
            num = num / 10;
        }

        System.out.println("Reminder " + rem);
        System.out.println("Reverse number " + reverseNum);

    }
}
