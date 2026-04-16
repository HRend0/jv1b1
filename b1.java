import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bán kính: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("Diện tích: %.2f\n", area);
        scanner.close();
    }
}