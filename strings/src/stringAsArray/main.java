package stringAsArray;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {


        String[] camel = {"hiThere","camelSnake","thatWasEasyTask","hateMyOwnLife"};
        System.out.println(Arrays.toString(CamelCaseSnake_Case.splitString(camel)));//task1

        String word = "That Word should be changed on letter, but who knows, is it work? word, ok?";
        System.out.println(ChangeWordOnLetter.wordOnLetterWithoutRegex(word)); //task2

        String str = " 1, 3, 4 or smth else. 2by the way. ok?3is3 thats fine.";
        System.out.println(DigitsNumbersEntry.entryWithoutRegex(str)); //task3

        String numbers = "Number 24255, is seem not random, but who care about it? 2, that's seems too.43";
        System.out.println(AmountOfNumbers.amountWithoutRegex(numbers)); //task4

        String space = "  Probably yo don't see    it, but here is     may   be some space    between words";
        System.out.println(DelSpace.delWithoutRegex(space)); //task5
    }
}
