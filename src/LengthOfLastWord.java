public class LengthOfLastWord {

    public static void main(String[] args) {
        int lastWordLength = new LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(lastWordLength);
    }

    public int lengthOfLastWord(String s) {
        // trim the sentence for remove the whitespaces
        // "    Hello world    " -> after trimmed -> "Hello world"
        s = s.trim();

        // get the index number of the full string from after the last " "
        int lastIndex = s.lastIndexOf(" ") + 1;

        return s.length() - lastIndex;
    }

}
