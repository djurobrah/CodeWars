public class GetTheMiddleCharacter {

    public static String getMiddle(String word) {
        int l = word.length();
        int position = Math.floorDiv(l, 2);
        System.out.println(position);
        if (l % 2 == 0) {
            return word.substring(position - 1, position + 1);
        }
        return String.valueOf(word.charAt(position));
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testt"));
    }
}
