import java.util.Scanner;

public class MinForTreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();
        scanner.close();

        if (a<b && a<c){
            System.out.println("Min a = " + a);
        } else if (b<a && b<c){
            System.out.println("Min b = " + b);
        } else {
            System.out.println("Min c = " + c);
        }

    }
}
