public class Dubstep {
    public static String songDecoder(String song) {
        String result = song.replace("WUB", " ");
        int l = result.length();
        while (true)
        {
            result = result.replace("  ", " ");
            if(result.length() == l)
            {
                break;
            }
            l = result.length();
        }
        if(result.charAt(0) == ' ') result = result.substring(1);
        if(result.charAt(result.length()-1) == ' ') result = result.substring(0, result.length() - 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(songDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }
}
