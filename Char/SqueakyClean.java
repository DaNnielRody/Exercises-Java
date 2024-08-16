package Char;


import java.util.HashMap;
import java.util.Map;

/*
In this exercise you will implement a partial set of utility routines to help a developer clean up SqueakyClean names.

In the 4 tasks you will gradually build up the clean method. A valid SqueakyClean name comprises zero or more letters and underscores.

In all cases the input string is guaranteed to be non-null. Note that the clean method should treat an empty string as valid.
 */
public class SqueakyClean {

    static String clean(String identifier) {
        identifier = removeUnderscore(identifier);
        identifier = toLetter(identifier);
        identifier = kebabCase(identifier);
        identifier = notChars(identifier);
        return identifier;
    }

    static String removeUnderscore(String identifier) {
        return identifier.replaceAll("_", " ");
    }

    static String toLetter(String identifier) {
        Map<Character, Character> map = new HashMap<>();
        map.put('4', 'a');
        map.put('3', 'e');
        map.put('0', 'o');
        map.put('1', 'l');
        map.put('7', 't');

        StringBuilder sb = new StringBuilder();

        for(char c : identifier.toCharArray()) {
            // If it has a value inside de map, return; otherwise, keep your value itself
            sb.append(map.getOrDefault(c, c));
        }
        return sb.toString();
    }

    static String kebabCase(String identifier) {
        StringBuilder sb = new StringBuilder();
        String[] splitting = identifier.split("-");

        for (int i = 0; i < splitting.length; i++) {
            String s = splitting[i];
            if(i == 0) {
                // The first part spplited will always be appended.
                sb.append(s);
            }else{
                sb.append(Character.toUpperCase(s.charAt(0)));
                // Taking the charAt(1) and the next ones.
                sb.append(s.substring(1));
            }
        }
        return sb.toString();
    }

    static String notChars(String identifier) {
        StringBuilder sb = new StringBuilder();

        for(char c : identifier.toCharArray()) {
            if(Character.isLetter(c) || c == '_') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

/*

Another kebab logic:

    static String kebabCase(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean convertNext = false;

        for (char c : identifier.toCharArray()) {
            if (c == '-') {
                convertNext = true;
            } else if (convertNext) {
                result.append(Character.toUpperCase(c));
                convertNext = false;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
 */