package inherit;

/**
 * Created by LiuJ on 2016/6/6.
 */
public class WelcomeRequest implements IRequest {
    private String place;

    public WelcomeRequest(String place) {
        this.place = place;
    }

    @Override
    public void execute() {
        System.out.printf("Welcome to %s\n", place);
    }
}
