package inherit;
import java.util.LinkedList;

/**
 * Created by LiuJ on 2016/6/7.
 */
public class StringQueue {
    private LinkedList<String> queue;

    public StringQueue() {
        this.queue = new LinkedList<String>();
    }

    public void put(String name) {
        queue.addFirst(name);
    }

    public String get() {
        return queue.removeLast();
    }

    public Boolean isEmpty(){
        return queue.isEmpty();
    }
}
