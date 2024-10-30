import java.util.Random;
import java.util.Scanner;

public class Task3 {
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+<>?";

    public Task3() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Введите длину пароля (8-12): ");
            int length = scanner.nextInt();
            if (length >= 8 && length <= 12) {
                Random random = new Random();
                String password = "";
                password = password + "ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt("ABCDEFGHIJKLMNOPQRSTUVWXYZ".length()));
                password = password + "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt("abcdefghijklmnopqrstuvwxyz".length()));
                password = password + "0123456789".charAt(random.nextInt("0123456789".length()));
                password = password + "!@#$%^&*()-_=+<>?".charAt(random.nextInt("!@#$%^&*()-_=+<>?".length()));
                String allChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+<>?";

                for(int i = 0; i < length - 4; ++i) {
                    password = password + allChars.charAt(random.nextInt(allChars.length()));
                }

                System.out.println("Сгенерированный пароль: " + password);
                scanner.close();
                return;
            }

            System.out.println("Недопустимая длина. Пожалуйста, введите число от 8 до 12.");
        }
    }
}
