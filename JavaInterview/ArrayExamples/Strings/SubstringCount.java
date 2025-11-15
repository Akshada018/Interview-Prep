package Strings;

public class SubstringCount {
    public static void main(String[] args) {
        String str = "whatisyournamewhatisyoursurnamewhatisfathersname";
        String sub = "what";

        int count = 0;
        int index = 0;

        // Loop until no more occurrences are found
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length();  // move past current match
        }

        System.out.println("Count of '" + sub + "' = " + count);
    }
}