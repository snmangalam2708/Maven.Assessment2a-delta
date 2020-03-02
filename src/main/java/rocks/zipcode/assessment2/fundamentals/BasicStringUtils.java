package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {

        StringBuilder newString = new StringBuilder(string1);
        newString.reverse();
        return newString.toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {

        StringBuilder newString1 = new StringBuilder(string1);
        StringBuilder newString2 = new StringBuilder(string2);
        StringBuilder reversed = new StringBuilder();
        newString1.reverse();
        newString2.reverse();

        return String.valueOf(reversed.append(newString1).append(newString2));
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {


        String[] charsToRemoveArray = charactersToRemove.split("");
        for (int i = 0; i < charsToRemoveArray.length; i++) {

            string = string.replace(charsToRemoveArray[i], "");

        }
        return string;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {

        String charsRemoved = removeCharacters(string, charactersToRemove);
        return reverse(charsRemoved);
    }
}
