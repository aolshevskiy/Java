package text.Analysis;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LexemeSort {
    public String divideOnClauses(String str, char g) {
        Pattern clausePattern = Pattern.compile("[^.]+[.]");
        Matcher clauseMatcher = clausePattern.matcher(str.toLowerCase());
        StringBuilder sb = new StringBuilder();
        while (clauseMatcher.find()) {
            sb.append(divideToWords(clauseMatcher.group(), g));
        }

        return sb.toString();
    }

    private String divideToWords(String str, char g) {
        Pattern wordPattern = Pattern.compile("([^.\\s]+)");
        Matcher wordMatcher = wordPattern.matcher(str);
        List<Clause> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while (wordMatcher.find()) {
            list.add(new Clause(wordMatcher.group(), count(wordMatcher.group(), g)));
        }
        list.sort(Clause::compareTo);
        for (Clause c : list) {
            sb.append(c.toString()).append(" ");
        }
        sb.append("\n");
        return sb.toString();
    }

    private static int count(String word, char g) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == g)
                count++;
        }
        return count;
    }

    public static class Clause implements Comparable<Clause> {
        private final String clause;
        private final int count;

        public Clause(String word, int count) {
            this.clause = word;
            this.count = count;
        }

        @Override
        public int compareTo(Clause o) {
            int temp = o.count - this.count;
            if (temp == 0) return this.clause.compareTo(o.clause);
            return temp;
        }

        @Override
        public String toString() {
            return clause;
        }
    }
}