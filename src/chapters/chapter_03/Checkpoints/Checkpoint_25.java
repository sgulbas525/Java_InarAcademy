import java.util.Scanner;

public class Checkpoint_25{
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter an age: ");
                int age = input.nextInt();

                System.out.println((age > 13) && (age <18));
        }
}
