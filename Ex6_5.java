import java.util.Arrays;
import java.util.Scanner;

public class Ex6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        double[] array = new double[n];
        System.out.println("Nhap " + n + " phan tu:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }
        Arrays.sort(array);
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / n;
        System.out.println("Mang da sap xep: " + Arrays.toString(array));
        System.out.printf("Tong %.2f\n", sum);
        System.out.printf("Trung binh %.2f\n", average);
        scanner.close();
    }
}
