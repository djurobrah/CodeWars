public class Mumbling {

    public static String accum(String s) {
        String result = "";
        for (int i = 1; i <= s.length(); i++) {
            char c = s.charAt(i - 1);
            for (int j = 0; j < i; j++)
            {
                result = (j == 0) ?
                        (result + Character.toUpperCase(c))
                        : (result + Character.toLowerCase(c));
                if(i != s.length() & j == i - 1)
                {
                    result += "-";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));
    }
}
