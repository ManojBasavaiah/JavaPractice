package Interview_questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class duplicateElements {
    public static void main(String[] args) {
        //1. compare each element: 0(nxn) worst soln
        String[] arr = {"apple", "Mango", "Orange", "Pineapple", "apple"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println(arr[i]);
                }
            }
        }
        //2. use set: 0(n)
        Set<String> values = new HashSet<String>();
        for (String s : arr) {
            if (!values.add(s)) {
                System.out.println(s);
            }
        }
        System.out.println(values);

        //3. using HashMap
        Map<String, Integer> hm = new HashMap<String, Integer>();
        for (String s1 : arr) {
            Integer count = hm.get(s1);
            if (count == null) {
                hm.put(s1, 1);
            } else {
                hm.put(s1, count + 1);
            }

        }
        System.out.println(hm);
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

        //get the value

    }

}

