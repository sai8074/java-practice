package power_pro;

public class StringTricks {

    public static void main(String[] args) {

        String s = "Nani";

        // ── Basic ──────────────────────────────────────────────
        System.out.println(s.length());           // 4 — length of string
        System.out.println(s.charAt(2));          // 'n' — char at index 2
        System.out.println(s.compareTo("Nani")); // 0 — equal strings return 0
        System.out.println("Hi nanna".substring(3) + "aa!?"); // "nannaa!?" — substring from index 3
        System.out.println(String.valueOf(23));   // "23" — int to String
        System.out.println(s.indexOf("a"));       // 1 — first index of 'a'

        // ── Search ─────────────────────────────────────────────
        System.out.println(s.lastIndexOf("a"));           // 3 — last index of 'a'
        System.out.println(s.contains("ani"));            // true — checks if substring exists
        System.out.println(s.startsWith("Na"));           // true — checks prefix
        System.out.println(s.endsWith("ni"));             // true — checks suffix
        System.out.println("12345".matches("\\d+"));      // true — regex full match
        System.out.println(s.equals("Nani"));             // true — content comparison (use this, not ==)
        System.out.println(s.equalsIgnoreCase("nani"));   // true — case-insensitive compare

        // ── Transform ──────────────────────────────────────────
        System.out.println(s.toUpperCase());              // "NANI"
        System.out.println(s.toLowerCase());              // "nani"
        System.out.println("  hello  ".trim());           // "hello" — removes leading/trailing spaces
        System.out.println("  hello  ".strip());          // "hello" — Unicode-aware (Java 11+)
        System.out.println("  hello".stripLeading());     // "hello" — removes leading spaces only
        System.out.println(s.replace('n', 'k'));          // "Naki" — replaces char
        System.out.println(s.replace("ani", "ice"));      // "Nice" — replaces substring
        System.out.println("a1b2c3".replaceAll("\\d", "#")); // "a#b#c#" — regex replace
        System.out.println(String.join("-", "a", "b", "c")); // "a-b-c" — join with delimiter

        String[] parts = "one,two,three".split(",");
        for (String p : parts)
            System.out.println(p);                        // one / two / three

        // ── Check ──────────────────────────────────────────────
        System.out.println("".isEmpty());                 // true — length is 0
        System.out.println("  ".isBlank());               // true — only whitespace (Java 11+)
        System.out.println("apple".compareTo("banana"));  // negative — 'a' < 'b'

        long countL = "hello world".chars()
                .filter(c -> c == 'l')
                .count();
        System.out.println(countL);                       // 3 — count of 'l' using streams

        // ── Convert ────────────────────────────────────────────
        System.out.println(Integer.parseInt("42"));       // 42 — String to int
        System.out.println(Integer.toString(42));         // "42" — int to String
        char[] arr = "Java".toCharArray();
        System.out.println(arr[0]);                       // 'J' — char array from string

        // ── Tricks ─────────────────────────────────────────────
        // StringBuilder — fast string building in loops
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" Nani");
        System.out.println(sb.toString());                // "Hello Nani"
        System.out.println(sb.reverse().toString());      // "inaN olleH"

        // String.format — formatted output
        System.out.println(String.format("Name: %s, Age: %d", "Nani", 20)); // "Name: Nani, Age: 20"
        System.out.println(String.format("%.2f", 3.14159));                  // "3.14"

        // repeat (Java 11+)
        System.out.println("Na".repeat(3));               // "NaNaNa"
        System.out.println("-".repeat(10));               // "----------"

        // Reverse a string
        String reversed = new StringBuilder("Nani").reverse().toString();
        System.out.println(reversed);                     // "inaN"

        // Palindrome check
        String word = "racecar";
        String rev = new StringBuilder(word).reverse().toString();
        System.out.println(word.equals(rev));             // true — it's a palindrome!

    }
}