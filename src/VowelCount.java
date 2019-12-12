public class VowelCount
{
    public static int getCount(String str) {
        int vowelsCount = 0;
        int i = 0;
        for (char c: str.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u')
            {
                vowelsCount++;
            }
            i++;
        }
        return vowelsCount;
    }

    public static void main(String[] args) {

    }
}
