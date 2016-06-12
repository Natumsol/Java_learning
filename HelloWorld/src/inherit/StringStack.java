package inherit;

import java.util.LinkedList;

/**
 * Created by LiuJ on 2016/6/7.
 */
public class StringStack {
    private LinkedList<String> linkedList;

    public StringStack() {
        this.linkedList = new LinkedList<String>();
    }
    public void push(String name) {
        linkedList.addFirst(name);
    }
    public String top(){
        return linkedList.getFirst();
    }
    public String pop() {
        return linkedList.removeFirst();
    }

    public Boolean isEmpty(){
        return linkedList.isEmpty();
    }

}
