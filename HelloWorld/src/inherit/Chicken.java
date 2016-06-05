package inherit;

/**
 * Created by natumsol on 16/6/3.
 */
public class Chicken extends Bird {
    private  String crest;

    public Chicken(String name, String crest) {
        super(name);
        this.crest = crest;
    }

    public String getCrest() {
        return crest;
    }

    public void setCrest(String crest) {
        this.crest = crest;
    }

    public void wu() {
        System.out.println("呜呜呜。。。");
    }
}
