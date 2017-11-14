import java.util.Scanner;
public class OneZeroOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        scanner.close();

        if (a < b){
            System.out.println("-1");
        }
        else if (a == b){
            System.out.println("0");
        }
        else{
            System.out.println("+1");
        }
    }
}
