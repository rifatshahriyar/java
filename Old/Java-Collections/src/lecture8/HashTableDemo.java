package lecture8;

import java.util.*;
 
 class HashTableDemo {

  public static void main(String args[]) {
    Hashtable<String, Double> balance = new Hashtable<>();
    String str;
    double bal;

    balance.put("John Doe", 3434.34);
    balance.put("Tom Smith", 123.22);
    //balance.put("Jane Baker", null); // error
    //balance.put(null, new Double(0)); // error
    balance.put("Jane Baker", 1378.00);
    balance.put("Tod Hall", 99.22);
    balance.put("Ralph Smith", -19.08);

    // Show all balances in hashtable
    Enumeration<String> names= balance.keys();
    while(names.hasMoreElements()) {
    	  str = names.nextElement();
      	  System.out.println(str + ": " +  balance.get(str));
    }
    System.out.println();

    String key = "John Doe";
    // Deposit 1,000 into John Doe's account
    bal =  balance.get(key);
    balance.put(key, bal+1000);
    System.out.println(key + "'s new balance: " +  balance.get(key));

    Set set = balance.keySet(); // get set view of keys
    Iterator<String> itr = set.iterator();     // get iterator
    while(itr.hasNext()) {
      str = itr.next();
      System.out.println(str + ": " + balance.get(str));
    }

    System.out.println();
  }
}