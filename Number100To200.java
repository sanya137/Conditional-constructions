import java.util.Scanner;

public class Number100To200 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n>100 && n<200){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
