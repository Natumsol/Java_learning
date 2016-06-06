package inherit;
import java.util.Scanner;

/**
 * Created by LiuJ on 2016/6/6.
 */
public class TextModeGame extends AbstractGuessGame {
    private Scanner scanner;

    public TextModeGame() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    protected void showMessage(String message) {
        for(int i = 0; i < message.length() * 2; i ++) {
            System.out.print("*");
        }
        System.out.println("\n" + message);
        for(int i = 0; i < message.length() * 2; i ++) {
            System.out.print("*");
        }
    }

    @Override
    protected int getUserInput() {
        System.out.print("\nPlease input a number: ");
        return scanner.nextInt();
    }
}
