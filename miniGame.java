import java.util.Random;
import java.util.Scanner;

public class miniGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int a = ran.nextInt(0, 11);
        int b;
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter a number: ");
            b = scan.nextInt();
            if (a!=b) {
                System.out.println("You have "+(3-i)+"change's");
            }else{
                System.out.println("you win");
            }
        }
    }
}
