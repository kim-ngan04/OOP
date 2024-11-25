import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        String strNum1 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1);
        System.out.print("Nhap so thu hai: ");
        String strNum2 = scanner.nextLine();
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient;
        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            quotient = Double.NaN;
        }
        System.out.println("Tong cua hai so la: " + sum);
        System.out.println("Hieu cua hai so la: " + difference);
        System.out.println("Tich cua hai so la: " + product);
        if (num2 != 0) {
            System.out.println("Thuong cua hai so la: " + quotient);
        } else {
            System.out.println("Khong xac dinh duoc thuong");
        }

        scanner.close();
    }
}
