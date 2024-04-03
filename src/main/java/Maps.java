
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> accountId = new HashMap<>();
        accountId.put("Account 1", 123);
        accountId.put("Account 2", 456);

        System.out.println(accountId);
        System.out.println(accountId.containsKey("Account 1"));
        System.out.println(accountId.containsKey("Account 3"));
        System.out.println(accountId.containsValue(9));

        System.out.println(accountId.get("Account 2"));
    }
}
