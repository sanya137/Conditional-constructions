import java.util.Scanner;

public class MinForTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        scanner.close();

        if (a < b){
            System.out.println("Min = " + a);
        }else{
            System.out.println("Min = " + b);
        }
    }
}
