import java.util.Scanner;

public class taskStrings {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку a: ");
        String a = in.nextLine();

        System.out.println("Введите строку b: ");
        String b = in.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }

        in.close();
    }
}
