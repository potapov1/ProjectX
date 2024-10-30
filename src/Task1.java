import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    private static final String[] WORDS = {"стол", "телевизор", "смартфон", "автомобиль", "кровать"};
    private static final int MAXLIVES = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = WORDS[new Random().nextInt(WORDS.length)];
        int lives = MAXLIVES;
        ArrayList<String> guessedLetters = new ArrayList<>();
        String maskedWord = "";
        boolean wordGuessed = false;

        while (lives > 0 && !wordGuessed) {
            for (String c : word.split("")) {
                if (guessedLetters.contains(c)) {
                    maskedWord += c;
                } else {
                    maskedWord += "_";
                }
            }
            System.out.println("Текущее слово: " + maskedWord);
            maskedWord = "";
            System.out.println("Оставшиеся жизни: " + lives);
            System.out.print("Угадай букву: ");
            String guessedLetter = scanner.next();
            if (guessedLetters.contains(guessedLetter)) {
                System.out.println("Вы уже догадались об этой букве");
            } else if (word.contains(guessedLetter)) {
                guessedLetters.add(guessedLetter);
                if (isWordGuessed(word, guessedLetters)) {
                    wordGuessed = true;
                }
            } else {
                guessedLetters.add(guessedLetter);
                lives--;
                System.out.println("Неверно! Жизни остались: " + lives);
            }
        }
        if (wordGuessed) {
            System.out.println("Вы угадали это слово: " + word);
        } else {
            System.out.println("Игра окончена, слово было: " + word);
        }
        scanner.close();
    }

    private static boolean isWordGuessed(String word, ArrayList<String> guessedLetters) {
        for (String c : word.split("")) {
            if (!guessedLetters.contains(c)) {
                return false;
            }
        }
        return true;
    }
}
