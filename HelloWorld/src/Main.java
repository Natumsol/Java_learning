import inherit.*;
public class Main {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("高能预警，有异常发生！");
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.print("Finally!");
        }
    }

}
