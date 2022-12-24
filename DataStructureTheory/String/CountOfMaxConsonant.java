package DataStructureTheory.String;

import java.util.HashMap;
import java.util.Map;

public class CountOfMaxConsonant {
    public static void main(String[] args) {

        countConsonant("paragliding");

    }

    public static void countConsonant(String str) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a') {
                if (count.containsKey('b')) {
                    count.put('b', count.get('b') + 1);

                } else {
                    count.put('b', 1);
                }
            } else if (ch == 'e') {
                if (count.containsKey('f')) {
                    count.put('f', count.get('f') + 1);

                } else {
                    count.put('f', 1);
                }
            } else if (ch == 'i') {
                if (count.containsKey('j')) {
                    count.put('j', count.get('j') + 1);

                } else {
                    count.put('j', 1);
                }
            } else if (ch == 'o') {
                if (count.containsKey('p')) {
                    count.put('p', count.get('p') + 1);

                } else {
                    count.put('p', 1);
                }
            } else if (ch == 'u') {
                if (count.containsKey('v')) {
                    count.put('v', count.get('v') + 1);

                } else {
                    count.put('v', 1);
                }
            } else {
                if (count.containsKey(ch)) {
                    count.put(ch, count.get(ch) + 1);

                } else {
                    count.put(ch, 1);
                }
            }

        }
        for (Map.Entry m : count.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }


    }
}
