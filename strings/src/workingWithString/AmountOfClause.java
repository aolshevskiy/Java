package workingWithString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* Task 2.10Строка X состоит из нескольких предложений,
 каждое из которых кончается точкой, восклицательным или вопросительным знаком. Определить количество предложений в строке X.*/
public class AmountOfClause {
    public static int amount(String str){
        Pattern pattern = Pattern.compile("([a-zA-Z][.]|[a-zA-Z][?]|[a-zA-Z][!])");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while(matcher.find()){
            count++;
        }
        return count;
    }
    public static int amountWithoutString(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            while (i < str.length()-1 && Character.isAlphabetic(str.charAt(i))) {
                i++;
                if ((str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '!') && Character.isLetterOrDigit(str.charAt(i-1))) {
                    count++;
                }
            }
        }
        return count;
    }
}
