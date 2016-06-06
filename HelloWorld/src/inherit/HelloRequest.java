package inherit;

/**
 * Created by LiuJ on 2016/6/6.
 */
public class HelloRequest implements IRequest {
    private String name;

    public HelloRequest(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.printf("Hello,%s\n", name);
    }
}
