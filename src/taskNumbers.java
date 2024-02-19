import java.util.Scanner;

public class taskNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = in.nextInt();

        System.out.println("Введите число b: ");
        int b = in.nextInt();

        if (a < b) {
            System.out.println("a<b");
        } else if (a > b) {
            System.out.println("a>b");
        } else {
            System.out.println("a=b");
        }
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        in.close();
    }
}
