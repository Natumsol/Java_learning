package inherit;

/**
 * Created by natumsol on 16/6/3.
 */
public class Bird {
    private String name;

    public Bird(){

    }

    public Bird(String name){
        this.name = name;
    }

    public void walk() {
        System.out.println("Walk!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
