import java.util.ArrayList;
import java.util.Arrays;

public class DirectionsReduction {

    public static String[] dirReduc(String[] arr) {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
        int size = arrayList.size();
        for (int i = 0; i < size - 1; i++) {
            if(cancelOut(arrayList.get(i), arrayList.get(i+1)))
            {
                arrayList.remove(i);
                arrayList.remove(i);
                size -= 2;
                i = -1;
            }
        }
        return arrayList.toArray(new String[0]);
    }

    public static boolean cancelOut(String a, String b)
    {
        if((a.equals("NORTH") & b.equals("SOUTH")) || (a.equals("SOUTH") & b.equals("NORTH"))
                || (a.equals("WEST") & b.equals("EAST")) || (a.equals("EAST") & b.equals("WEST")))
        {
            return true;
        }
        return false;
    }

//{ "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" }
    //{ "SOUTH", "EAST", "WEST", "NORTH", "WEST" }
    //{ "SOUTH", "NORTH", "WEST" }


    public static void main(String[] args) {
        for (String s : dirReduc(new String[]{ "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" })) {
            System.out.println(s + ", ");
        }
    }
}
