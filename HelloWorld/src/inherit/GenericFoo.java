package inherit;

/**
 * Created by LiuJ on 2016/6/7.
 */
public class GenericFoo<T>{
    private T foo;

    public GenericFoo(T foo) {
        this.foo = foo;
    }

    public T getFoo() {
        return foo;
    }

    public void setFoo(T foo) {
        this.foo = foo;
    }
}
