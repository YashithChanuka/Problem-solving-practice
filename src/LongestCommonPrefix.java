public class LongestCommonPrefix {

    public static void main(String[] args) {
        String s = new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(s);
    }

    public String longestCommonPrefix(String[] strings) {
        String commonPrefix = "";

        if (strings.length == 0) {
            return commonPrefix;
        } else {
            commonPrefix = strings[0];
        }

        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
            }
        }
        return commonPrefix;
    }

}
