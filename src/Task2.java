import java.util.Scanner;

public class Task2 {
    private static final double USD = 0.013;
    private static final double RUB = 29.24;
    private static final double EUR = 0.27;
    private static final double CNY = 2.14;
    private static final double KZT = 147.75;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в белоруских рублях(BYN): ");
        double byn = scanner.nextDouble();

        System.out.println("В долларах(USD):" + byn * USD);
        System.out.println("В российских рублях(RUB):" + byn * RUB);
        System.out.println("В евро(EUR):" + byn * EUR);
        System.out.println("В юанях(CNY):" + byn * CNY);
        System.out.println("В тенге(USD):" + byn * KZT);
        scanner.close();
    }
}
