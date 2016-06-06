package inherit;

/**
 * Created by LiuJ on 2016/6/6.
 */
public abstract class AbstractGuessGame {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void start(){
        showMessage("Welcome!");
        int guess = 0 ;
        do {
            guess = getUserInput();
            if(guess > number) {
                showMessage("input larger!");
            } else if(guess < number) {
                showMessage("input smaller");
            } else {
                showMessage("bingo!");
            }
        } while (guess != number);
    }

    protected abstract void showMessage(String message);
    protected abstract int getUserInput();
}
