import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class HashMapDemo {
    public static void main(String args[]) {
        HashMap<String, Double> balance = new HashMap<>();
        // ConcurrentHashMap balance<String, Double> = new ConcurrentHashMap<>(); // for multi-threading
        String str;
        double bal;

        balance.put("John Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", null);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", -19.08);
        balance.put(null, 0.0);

        // show all balances in hashtable
        Set<String> set = balance.keySet(); // get set view of keys
        // get iterator
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        String key = "John Doe";
        // Deposit 1,000 into John Doe's account
        bal = balance.get(key);
        balance.put(key, bal + 1000);
        System.out.println(key + "'s new balance: " + balance.get(key));

    }
}


