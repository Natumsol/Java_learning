import java.util.Scanner;
import account.Account;
public class Main {

    public static void main(String[] args) {
        Object [] arr = new Object[4];
        arr[0] = new Integer(4);
        arr[1] = new String("我是一个字符串");

        for (Object obj: arr) {
            System.out.println(obj);
        }
    }

    public static void testAccount(){
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("liujia", 100.0);

        System.out.print("存入:");
        double deposit = scanner.nextDouble();
        account.deposit(deposit);
        System.out.println("my balance is:" + account.getBalance());

        System.out.print("取出:");
        double withdraw = scanner.nextDouble();
        account.withdraw(withdraw);
        System.out.println("my balance is:" + account.getBalance());

    }
}
